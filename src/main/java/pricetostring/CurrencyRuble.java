package pricetostring;

public class CurrencyRuble extends AbstractCurrency implements Currency {
    private final String[] RUB = {"рублей", "рубль", "рубля", "рубля", "рубля", "рублей", "рублей", "рублей", "рублей", "рублей"};

    @Override
    public String getCurrencyName(int price) {
        int ones = price % 10;
        int tens = price % 100 / 10;

        if (tens == 1) {
            return RUB[0];
        } else {
            return RUB[ones];
        }
    }
}
