package lt.techin.andzej;

import itadesign.beerdrinker.NoMoreMaltException;

public class Main {
    public static void main(String[] args) throws NoMoreMaltException {
        MyBeerFactory factory = new MyBeerFactory();
        factory.receiveMaltShippment(1);

        for (int i = 0; i < 41; i++) {

            factory.produceNextBeerBottle();
        }

    }
}
