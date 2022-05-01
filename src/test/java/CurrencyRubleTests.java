import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pricetostring.Currency;
import pricetostring.CurrencyRuble;

public class CurrencyRubleTests {

    @Test
    void test0() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(0));
    }

    @Test
    void test1() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рубль", currency.getCurrencyName(1));
    }

    @Test
    void test3() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рубля", currency.getCurrencyName(3));
    }

    @Test
    void test5() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(5));
    }

    @Test
    void test9() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(9));
    }

    @Test
    void test10() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(10));
    }

    @Test
    void test11() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(11));
    }

    @Test
    void test19() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(19));
    }

    @Test
    void test20() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(20));
    }

    @Test
    void test21() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рубль", currency.getCurrencyName(21));
    }

    @Test
    void test99() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(99));
    }

    @Test
    void test100() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(100));
    }

    @Test
    void test101() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рубль", currency.getCurrencyName(101));
    }

    @Test
    void test110() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(110));
    }

    @Test
    void test111() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(111));
    }

    @Test
    void test999() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(999));
    }

    @Test
    void test1000() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(1000));
    }

    @Test
    void test1001() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рубль", currency.getCurrencyName(1001));
    }

    @Test
    void test1010() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(1010));
    }

    @Test
    void test1011() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(1011));
    }

    @Test
    void test1100() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(1100));
    }

    @Test
    void test3000() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(3000));
    }

    @Test
    void test5000() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(5000));
    }

    @Test
    void test9000() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(9000));
    }

    @Test
    void test9999() {
        Currency currency = new CurrencyRuble();
        Assertions.assertEquals("рублей", currency.getCurrencyName(9999));
    }
}
