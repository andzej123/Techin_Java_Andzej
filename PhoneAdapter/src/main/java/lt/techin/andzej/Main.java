package lt.techin.andzej;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");



        Phone p = new MobilePhoneAdapter(new MobilePhone());

        System.out.println(AutomaticDialer.dial(p));

    }
}
