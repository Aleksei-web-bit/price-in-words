package pricetostring;

import java.util.ArrayList;
import java.util.List;

public class Price {
    private final int price;
    private final Currency currency;

    public Price(int price, Currency currency) {
        if (price <= 0 || price > 9999) {
            throw new IllegalArgumentException("Значение 'price' должно быть больше нуля и меньше 10000.");
        }

        if (currency == null) {
            throw new IllegalArgumentException("Значение 'currency' не должно быть null.");
        }

        this.price = price;
        this.currency = currency;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getPriceToWords() {
        String result = "";
        String text = "";
        String[] currencies = this.currency.getCurrencyName();
        List<Integer> segments = new ArrayList<>();
        int number = price;
        while (number > 0) {
            int segment = number % 1000;
            segments.add(segment);
            number = number / 1000;
        }

        for (int i = segments.size() - 1; i >= 0; i--) {
            int low = segments.get(i) % 10;
            int average = segments.get(i) % 100 / 10;
            int hi = segments.get(i) / 100;
            if (average == 0) {
                text = Words.getHundreds(hi) + " " + Words.getFromZeroTillNine(i, low);
            } else if (average == 1) {
                text = Words.getHundreds(hi) + " " + Words.getFromTenTillNineteen(low);
            } else {
                text = Words.getHundreds(hi) + " " + Words.getTens(average) + " " + Words.getFromZeroTillNine(i, low);
            }

            if (i > 0) {
                if (average == 1) {
                    text = text + " " + Words.getThousands(0) + " ";
                } else {
                    text = text + " " + Words.getThousands(low) + " ";
                }
            } else if (i == 0 && average == 1) {
                text = text + " " + currencies[0];
            } else {
                text = text + " " + currencies[low];
            }
            result += text;
        }
        return result.trim().replace("  ", " ");
    }
}
