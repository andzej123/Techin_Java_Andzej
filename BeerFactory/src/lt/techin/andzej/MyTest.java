package lt.techin.andzej;

import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.BeerFactory;
import itadesign.test.AbstractBeerTest;

public class MyTest extends AbstractBeerTest {
    @Override
    protected BeerFactory getBeerFactory() {
        return new MyBeerFactory();
    }

    @Override
    protected BeerConsumer getBeerConsumer() {
        return new MyBeerConsumer();
    }
}
