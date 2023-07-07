package JUnit_Tests.homework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @Test
    public void testConvertToDollars() {
        CurrencyConverter converter = new CurrencyConverter(0.85, 0.92, 0.75, 0.0092);
        double amount = 100;
        double expectedAmount = 100 / 0.85;
        Assertions.assertEquals(expectedAmount, converter.convertToDollars(amount, CurrencyConverter.Currency.EURO));
    }

    @Test
    public void testConvertFromDollars() {
        CurrencyConverter converter = new CurrencyConverter(0.85, 0.92, 0.75, 0.0092);
        double amount = 100;
        double expectedAmount = 100 * 0.85;
        Assertions.assertEquals(expectedAmount, converter.convertFromDollars(amount, CurrencyConverter.Currency.EURO));
    }
}