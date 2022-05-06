package pricetostring;

import java.util.ArrayList;
import java.util.List;

public class Price {
    private final int price;
    private final Currency currency;

    public Price(int price, Currency currency) {
        if (price < 0 || price > 9999) {
            throw new IllegalArgumentException("Допустимое числовое значение цены должно быть от 0 до 10000.");
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
        if (price == 0) {
            return "ноль " + this.currency.getCurrencyName(0);
        }
        String result = "";
        String text = "";
        List<Integer> segments = findSegments(price);

        for (int i = segments.size() - 1; i >= 0; i--) {
            int ones = segments.get(i) % 10;
            int tens = segments.get(i) % 100 / 10;
            int hundreds = segments.get(i) / 100;
            if (tens == 0) {
                text = Words.getHundreds(hundreds) + " " + Words.getFromZeroTillNine(i, ones);
            } else if (tens == 1) {
                text = Words.getHundreds(hundreds) + " " + Words.getFromTenTillNineteen(ones);
            } else {
                text = Words.getHundreds(hundreds) + " " + Words.getTens(tens) + " " + Words.getFromZeroTillNine(i, ones);
            }

            if (i > 0) {
                if (tens == 1) {
                    text = text + " " + Words.getThousands(0) + " ";
                } else {
                    text = text + " " + Words.getThousands(ones) + " ";
                }
            }
            result += text;
        }
        result += " " + this.currency.getCurrencyName(price);
        return result.trim().replaceAll(" +", " ");
    }

    private List<Integer> findSegments(int price) {
        List<Integer> segments = new ArrayList<>();
        if (price == 0) {
            segments.add(price);
        } else {
            int number = price;
            while (number > 0) {
                int segment = number % 1000;
                segments.add(segment);
                number = number / 1000;
            }
        }
        return segments;
    }
}
