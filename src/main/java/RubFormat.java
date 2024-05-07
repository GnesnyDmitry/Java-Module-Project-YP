public class RubFormat {
    static public String rubFormat(double rub) {
        String ending;
        int rubles = (int) rub;
        int lastDigit = rubles % 10;
        int lastTwoDigits = rubles % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            ending = "рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4 && (lastTwoDigits < 12 || lastTwoDigits > 14)) {
            ending = "рубля";
        } else {
            ending = "рублей";
        }

        return String.format("%.2f %s", rub, ending);
    }
}

