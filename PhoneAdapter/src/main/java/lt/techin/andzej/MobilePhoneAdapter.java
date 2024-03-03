package lt.techin.andzej;

import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {

    String number;

    MobilePhone mob;

    public MobilePhoneAdapter(MobilePhone mob) {
        this.mob = mob;
    }

    @Override
    public void dial(String s) {
        number = s;
        System.out.println("Dialling " + s);
    }

    @Override
    public String getReponse() {
        return mob.dial(number);
    }
}
