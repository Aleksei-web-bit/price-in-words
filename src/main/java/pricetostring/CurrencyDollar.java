package pricetostring;

public class CurrencyDollar extends AbstractCurrency implements Currency {
    private final String[] USD = {"долларов", "доллар", "доллара", "доллара", "доллара", "долларов", "долларов", "долларов", "долларов", "долларов"};

    @Override
    public String getCurrencyName(int price) {
        int ones = price % 10;
        int tens = price % 100 / 10;

        if (tens == 1) {
            return USD[0];
        } else {
            return USD[ones];
        }
    }
}