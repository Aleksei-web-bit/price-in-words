package pricetostring;

public class CurrencyRubl implements Currency {
    private final String[] RUB = {"рублей", "рубль", "рубля", "рубля", "рубля", "рублей", "рублей", "рублей", "рублей", "рублей"};

    @Override
    public String[] getCurrencyName() {
        return RUB;
    }
}
