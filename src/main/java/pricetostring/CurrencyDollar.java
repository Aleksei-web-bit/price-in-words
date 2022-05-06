package pricetostring;

public class CurrencyDollar extends AbstractCurrency {
    private final String[] USD = {"долларов", "доллар", "доллара", "доллара", "доллара", "долларов", "долларов", "долларов", "долларов", "долларов"};

    @Override
    public String getCurrencyName(int price) {
        return getCurrencyName(USD, price);
    }
}