package lt.techin.andzej;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.DefaultBeerBottle;

public class MyBeerConsumer extends BeerConsumer {
    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
        if (getBloodAlcoholContentInLiters() * 1000 > 120) return false;
        return beerBottle.getVolumeInLiters() <= 0.5 && beerBottle.getAlcoholContentInPercent() <= 6;
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean b) {
        if (b) {
            return new BottleDecorator(beerBottle);
        } else {
            return beerBottle;
        }
    }
}
