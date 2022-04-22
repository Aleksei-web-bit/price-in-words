package pricetostring;

public class CurrencyDollar implements Currency {
    private final String[] USD = {"долларов", "доллар", "доллара", "доллара", "доллара", "долларов", "долларов", "долларов", "долларов", "долларов"};

    @Override
    public String[] getCurrencyName() {
        return USD;
    }
}
