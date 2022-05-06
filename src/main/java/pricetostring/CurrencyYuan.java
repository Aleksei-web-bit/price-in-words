package pricetostring;

public class CurrencyYuan extends AbstractCurrency {
    private final String[] CNY = {"юаней", "юань", "юаня", "юаня", "юаня", "юаней", "юаней", "юаней", "юаней", "юаней"};

    @Override
    public String getCurrencyName(int price) {
        return getCurrencyName(CNY, price);
    }
}
