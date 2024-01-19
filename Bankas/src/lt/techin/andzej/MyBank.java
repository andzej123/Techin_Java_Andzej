package lt.techin.andzej;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.*;

public class MyBank implements Bank {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return accounts.stream().map(Account::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public Account openDebitAccount(String s) {
        Account userAccount = new DebitAccount(s);
        if (accounts.stream().anyMatch(userAccount1 -> userAccount1.getHolderName().contains(s))) {
            return null;
        } else {
            accounts.add(userAccount);
            return userAccount;
        }
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        Account userAccount = new CreditAccount(s, bigDecimal);
        if (accounts.stream().anyMatch(userAccount1 -> userAccount1.getHolderName().contains(s))) {
            return null;
        } else {
            accounts.add(userAccount);
            return userAccount;
        }
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return accounts.stream().filter(u -> u.getHolderName().equals(s))
                .findFirst().orElse(null);
    }

    @Override
    public Account getAccountByNumber(String s) {
        return accounts.stream().filter(u -> u.getNumber().equals(s))
                .findFirst().orElse(null);
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account);
    }
}
