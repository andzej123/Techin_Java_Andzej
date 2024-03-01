package lt.techin.andzej;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.DefaultBeerBottle;

public class BottleDecorator implements BeerBottle {
    
    BeerBottle bottle;

    public BottleDecorator(BeerBottle bottle) {
        this.bottle = bottle;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return 0;
    }

    @Override
    public double getVolumeInLiters() {
        return bottle.getVolumeInLiters();
    }

    @Override
    public void takeASip(double v) {
        bottle.takeASip(v);

    }
}
