package pricetostring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceToWords {

    public static void main(String[] args) {
        boolean ok = false;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Пожалуйста, введите целочисленное значение цены от 0 до 10000: ");
                int number = sc.nextInt();
                if (number <= 0 || number > 9999)
                    throw new RuntimeException("Числовое значение суммы должно находиться в диапазоне от 0 до 10000.");
                Currency currency = new CurrencyRubl();
                Price price = new Price(number, currency);
                String result = price.getPriceToWords();
                System.out.println(result);
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод данных. Необходимо целочисленное значение.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!ok);
    }
}
