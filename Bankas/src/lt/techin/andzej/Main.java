package lt.techin.andzej;

import ibank.Account;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        MyBank superBank = new MyBank();
        Account jonas = superBank.openCreditAccount("Jonas", new BigDecimal(100));
        Account petras = superBank.openCreditAccount("Petras", new BigDecimal(50));
        jonas.withdraw(new BigDecimal(100));



        System.out.println(superBank.getTotalReserves());
        System.out.println(superBank.getAllAccounts());


    }
}
