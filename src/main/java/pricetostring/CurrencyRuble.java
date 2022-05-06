package pricetostring;

public class CurrencyRuble extends AbstractCurrency {
    private final String[] RUB = {"рублей", "рубль", "рубля", "рубля", "рубля", "рублей", "рублей", "рублей", "рублей", "рублей"};

    @Override
    public String getCurrencyName(int price) {
        return getCurrencyName(RUB, price);
    }
}
