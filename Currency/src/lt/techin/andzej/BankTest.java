package lt.techin.andzej;

import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;
import lt.techin.andzej.MyBank;
import lt.techin.andzej.MyCurrencyConverter;

public class BankTest extends BaseTest {
    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return new MyBank(currencyConverter);
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return new MyCurrencyConverter(currencyRatesProvider);
    }
}
