package lt.techin.andzej;

import ibank.Account;

import java.math.BigDecimal;

public class DebitAccount implements Account {
    private final String name;
    private BigDecimal balance;
    private final String accountNumber;

    public DebitAccount(String name) {
        this.name = name;
        this.balance = new BigDecimal(0);
        this.accountNumber = UniqueNumberGenerator.generateUniqueNumber();
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
        if (bigDecimal.compareTo(balance) > 0) {
            return false;
        } else {
            balance = balance.subtract(bigDecimal);
            return true;
        }
    }

    @Override
    public String toString() {
        return "\n" + "User{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}' + "\n";
    }
}
