package pricetostring;

public class Words {
    private static final String[][] FROM_ZERO_TILL_NINE = {{"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}, {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}};
    private static final String[] FROM_TEN_TILL_NINETEEN = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] TENS = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static final String[] HUNDREDS = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String[] THOUSANDS = {"тысяч", "тысяча", "тысячи", "тысячи", "тысячи", "тысяч", "тысяч", "тысяч", "тысяч", "тысяч"};

    public static String getFromZeroTillNine(int i, int j) {
        return FROM_ZERO_TILL_NINE[i][j];
    }

    public static String getFromTenTillNineteen(int i) {
        return FROM_TEN_TILL_NINETEEN[i];
    }

    public static String getTens(int i) {
        return TENS[i];
    }

    public static String getHundreds(int i) {
        return HUNDREDS[i];
    }

    public static String getThousands(int i) {
        return THOUSANDS[i];
    }
}
