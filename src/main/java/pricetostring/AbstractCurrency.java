package pricetostring;

public abstract class AbstractCurrency implements Currency {
    protected String getCurrencyName(String[] numerals, int price) {
        int ones = price % 10;
        int tens = price % 100 / 10;

        if (tens == 1) {
            return numerals[0];
        } else {
            return numerals[ones];
        }
    }
}
