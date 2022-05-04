package pricetostring;

public interface Currency {
    String getCurrencyName(int price);

    default String getCurrencyName0(String[] numerals, int price){
        int ones = price % 10;
        int tens = price % 100 / 10;

        if (tens == 1) {
            return numerals[0];
        } else {
            return numerals[ones];
        }

    }
}
