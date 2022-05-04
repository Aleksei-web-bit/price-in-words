import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pricetostring.Currency;
import pricetostring.CurrencyRuble;
import pricetostring.Price;

public class PriceTests {

//    @Test
//    void priceToWordsTest0Rubles(){
//        Currency currency = new CurrencyRuble();
//        Price price = new Price(0, currency);
//        Assertions.assertEquals("ноль рублей", price.getPriceToWords());
//    }

    @Test
    void priceToWordsTest1Ruble() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(1, currency);
        Assertions.assertEquals("один рубль", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest3Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(3, currency);
        Assertions.assertEquals("три рубля", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest5Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(5, currency);
        Assertions.assertEquals("пять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest9Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(9, currency);
        Assertions.assertEquals("девять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest10Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(10, currency);
        Assertions.assertEquals("десять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest11Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(11, currency);
        Assertions.assertEquals("одиннадцать рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest19Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(19, currency);
        Assertions.assertEquals("девятнадцать рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest20Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(20, currency);
        Assertions.assertEquals("двадцать рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest21Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(21, currency);
        Assertions.assertEquals("двадцать один рубль", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest99Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(99, currency);
        Assertions.assertEquals("девяносто девять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest100Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(100, currency);
        Assertions.assertEquals("сто рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest101Ruble() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(101, currency);
        Assertions.assertEquals("сто один рубль", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest110Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(110, currency);
        Assertions.assertEquals("сто десять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest111Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(111, currency);
        Assertions.assertEquals("сто одиннадцать рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest999Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(999, currency);
        Assertions.assertEquals("девятьсот девяносто девять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest1000Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(1000, currency);
        Assertions.assertEquals("одна тысяча рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest1001Ruble() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(1001, currency);
        Assertions.assertEquals("одна тысяча один рубль", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest1010Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(1010, currency);
        Assertions.assertEquals("одна тысяча десять рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest1011Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(1011, currency);
        Assertions.assertEquals("одна тысяча одиннадцать рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest1100Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(1100, currency);
        Assertions.assertEquals("одна тысяча сто рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest3000Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(3000, currency);
        Assertions.assertEquals("три тысячи рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest5000Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(5000, currency);
        Assertions.assertEquals("пять тысяч рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest9000Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(9000, currency);
        Assertions.assertEquals("девять тысяч рублей", price.getPriceToWords());
    }

    @Test
    void priceToWordsTest9999Rubles() {
        Currency currency = new CurrencyRuble();
        Price price = new Price(9999, currency);
        Assertions.assertEquals("девять тысяч девятьсот девяносто девять рублей", price.getPriceToWords());
    }

    @Test
    void testNotNull() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Price price = new Price(1, null);
        });
        Assertions.assertEquals("Значение 'currency' не должно быть null.", exception.getMessage());
    }

    @Test
    void testLessZero() {
        Currency currency = new CurrencyRuble();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Price price = new Price(-1, currency);
        });
        Assertions.assertEquals("Значение 'price' должно быть больше нуля и меньше 10000.", exception.getMessage());
    }

    @Test
    void testMoreMaximumAllowedValue() {
        Currency currency = new CurrencyRuble();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Price price = new Price(10000, currency);
        });
        Assertions.assertEquals("Значение 'price' должно быть больше нуля и меньше 10000.", exception.getMessage());
    }
}
