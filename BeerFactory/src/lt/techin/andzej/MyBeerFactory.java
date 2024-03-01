package lt.techin.andzej;

import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

import java.util.Random;

public class MyBeerFactory implements BeerFactory {

    private int maltReserve = 1000;

    @Override
    public void receiveMaltShippment(double v) {
        maltReserve += (int) v * 1000;
    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle() throws NoMoreMaltException {
        Random r = new Random();
        double rangeMinVolume = 0.33;
        double rangeMaxVolume = 0.5;
        double randomValueVolume = rangeMinVolume + (rangeMaxVolume - rangeMinVolume) * r.nextDouble();
        double rangeMinAlcohol = 4.5;
        double rangeMaxAlcohol = 5.7;
        double randomValueAlcohol = rangeMinAlcohol + (rangeMaxAlcohol - rangeMinAlcohol) * r.nextDouble();

        if (maltReserve < 25) throw new NoMoreMaltException("");
        maltReserve -= 25;
        return new DefaultBeerBottle(randomValueVolume, randomValueAlcohol);


    }
}
