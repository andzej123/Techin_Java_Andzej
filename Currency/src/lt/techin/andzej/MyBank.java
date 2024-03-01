package lt.techin.andzej;

import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.Set;

public class MyBank implements Bank {

    SequenceGenerator sqCustomer = new SequenceGenerator();
    SequenceGenerator sqAccount = new SequenceGenerator();
    SequenceGenerator sqTransfer = new SequenceGenerator();
    ArrayList<Customer> listOfCustomers = new ArrayList<>();
    CurrencyConverter currencyConverter;

    public MyBank(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (listOfCustomers.stream().map(Customer::getPersonCode).anyMatch(personCode1 -> personCode1.equals(personCode))) {
            throw new CustomerCreateException("attempting to create a customer with a person code for which such customer already exist");
        }
        if (personCode == null || personName == null) {
            throw new NullPointerException();
        }
        Customer customer = new Customer(sqCustomer.getNext(), personCode, personName);
        listOfCustomers.add(customer);
        return customer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (customer == null || currency == null) {
            throw new NullPointerException();
        }
        Customer cus = listOfCustomers.stream().filter(p -> p.equals(customer)).findFirst().orElseThrow(() -> new AccountCreateException("attempting to create an account for a customer which does not belong to this bank"));
        Account acc = new Account(sqAccount.getNext(), customer, currency, new Money(0));
        cus.addAccount(acc);
        return acc;
    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        if (account.getBalance().isLessThan(money)) throw new InsufficientFundsException("");
        Operation op = new Operation(sqTransfer.getNext(), account, account1, money);
        account.setBalance(account.getBalance().substract(money));
        if (account.getCurrency().equals(account1.getCurrency())) {
            account1.setBalance(account1.getBalance().add(money));
        } else {
            Money m = currencyConverter.convert(account.getCurrency(), account1.getCurrency(), money);
            account1.setBalance(account1.getBalance().add(m));
        }
        return op;
    }

    public void getListOfCustomers() {
        for (Customer c : listOfCustomers) {
            System.out.println(c);
        }
    }

    @Override
    public Money getBalance(Currency currency) {
//        Money total = new Money(0);
//        for (Customer c : listOfCustomers) {
//            Set<Account> accounts = c.getAccounts();
//            for (Account a : accounts) {
//                if (a.getCurrency().equals(currency)) {
//                    total = total.add(a.getBalance());
//                } else {
//                    Money m = currencyConverter.convert(a.getCurrency(), currency, a.getBalance());
//                    total = total.add(m);
//                }
//            }
//        }
//        return total;
        return listOfCustomers.stream()
                .flatMap(c -> c.getAccounts().stream())
                .map(a -> a.getCurrency().equals(currency) ? a.getBalance() : currencyConverter.convert(a.getCurrency(), currency, a.getBalance()))
                .reduce(Money::add)
                .orElse(new Money(0));
    }

}
