package pricetostring;

public class CurrencyYuan extends AbstractCurrency implements Currency {
    private final String[] CNY = {"юаней", "юань", "юаня", "юаня", "юаня", "юаней", "юаней", "юаней", "юаней", "юаней"};

    @Override
    public String getCurrencyName(int price) {
        int ones = price % 10;
        int tens = price % 100 / 10;

        if (tens == 1) {
            return CNY[0];
        } else {
            return CNY[ones];
        }
    }
}
