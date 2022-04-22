package pricetostring;

public class CurrencyYuan implements Currency {
    private final String[] CNY = {"юаней", "юань", "юаня", "юаня", "юаня", "юаней", "юаней", "юаней", "юаней", "юаней"};

    @Override
    public String[] getCurrencyName() {
        return CNY;
    }
}
