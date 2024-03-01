package lt.techin.andzej;

import lt.itakademija.exam.*;

public class MyCurrencyConverter implements CurrencyConverter {

    CurrencyRatesProvider currencyRatesProvider;

    public MyCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        this.currencyRatesProvider = currencyRatesProvider;
    }


    @Override
    public Money convert(Currency currency, Currency currency1, Money money) {
        if (currency == null || currency1 == null || money == null) throw new CurrencyConversionException("");
        Money ratio = currencyRatesProvider.getRate(currency, currency1);
        if (ratio == null) throw new CurrencyConversionException("");
        return money.multiply(ratio);
    }
}
