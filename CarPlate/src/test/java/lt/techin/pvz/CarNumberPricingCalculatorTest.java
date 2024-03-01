package lt.techin.pvz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CarNumberPricingCalculatorTest {

    CarNumberPricingCalculator calc = new CarNumberPricingCalculator();

    @Test
    void testAllLettersIsEqual() {
        double result = calc.calculatePrice("AAA547");
        assertEquals(1000, result, "wrong result");
    }

    @Test
    void testAllDigitsIsEqual() {
        double result = calc.calculatePrice("YDH555");
        assertEquals(1000, result, "wrong result");
    }

    @Test
    void testSpecialDigits() {
        double result1 = calc.calculatePrice("ABT001");
        double result2 = calc.calculatePrice("ABT005");
        double result3 = calc.calculatePrice("ABT009");
        assertEquals(1000, result1, "wrong result");
        assertEquals(1000, result2, "wrong result");
        assertEquals(1000, result3, "wrong result");
    }

    @Test
    void testAllLettersAndAllDigitsIsEqual() {
        double result = calc.calculatePrice("AAA555");
        assertEquals(5000, result, "wrong result");
    }

    @Test
    void testSpecialLetters() {
        double result1 = calc.calculatePrice("GOD547");
        double result2 = calc.calculatePrice("KLR005");
        double result3 = calc.calculatePrice("BOS009");
        assertEquals(2000, result1, "wrong result");
        assertEquals(2000, result2, "wrong result");
        assertEquals(2000, result3, "wrong result");
    }

    @Test
    void testSpecialLettersAndEqualsDigits() {
        double result1 = calc.calculatePrice("GOD222");
        double result2 = calc.calculatePrice("KLR222");
        double result3 = calc.calculatePrice("BOS222");
        assertEquals(7000, result1, "wrong result");
        assertEquals(7000, result2, "wrong result");
        assertEquals(7000, result3, "wrong result");
    }

    @ParameterizedTest
    @ValueSource(strings = {"A", "A1", "FR547", "ARER414", "BOS222HF"})
    void testNumberLength(String input) {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calculatePrice(input);
        });

        String expectedMessage = "Incorrect plate number format. Must be 1-6 symbols latin letters and number combination";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "Error message doesn't match");
    }

    @ParameterizedTest
    @ValueSource(strings = {"AA1256", "A4T589", "4TR963", "ART41R", "ARR2T4", "AETR58"})
    void testNamedNumbers(String input) {
        assertEquals(10000, calc.calculatePrice(input), "wrong result");
    }

    @Test
    void testLowerUpperCases() {
        double result1 = calc.calculatePrice("GOd222");
        double result2 = calc.calculatePrice("KlR222");
        double result3 = calc.calculatePrice("bOS222");
        double result4 = calc.calculatePrice("ggG963");
        double result5 = calc.calculatePrice("Eee222");
        assertEquals(7000, result1, "wrong result");
        assertEquals(7000, result2, "wrong result");
        assertEquals(7000, result3, "wrong result");
        assertEquals(1000, result4, "wrong result");
        assertEquals(5000, result5, "wrong result");
    }


}