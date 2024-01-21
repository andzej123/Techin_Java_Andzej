package lt.techin.andzej;

import ibank.Account;

import java.math.BigDecimal;

public class CreditAccount implements Account {

    private final String name;
    private BigDecimal balance;
    private final String accountNumber;
    private final BigDecimal creditLimit;

    public CreditAccount(String name, BigDecimal creditLimit) {
        this.name = name;
        this.balance = new BigDecimal(0);
        this.accountNumber = UniqueNumberGenerator.generateUniqueNumber();
        this.creditLimit = creditLimit;
    }


    @Override
    public String getNumber() {
        return accountNumber;
    }

    @Override
    public String getHolderName() {
        return name;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        balance = balance.add(bigDecimal);
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        if (balance.add(creditLimit).compareTo(bigDecimal) >= 0) {
            balance = balance.subtract(bigDecimal);
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\n" + "User{" +
                "name='" + getHolderName() + '\'' +
                ", balance=" + getBalance() +
                ", accountNumber='" + getNumber() + '\'' +
                ", creditLimit=" + creditLimit +
                '}' + "\n";
    }
}
