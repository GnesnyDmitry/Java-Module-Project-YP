import java.util.Scanner;

public class Validator {

    public static int getPeopleCount() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int count;
        while (true) {
            if (scanner.hasNextInt() && (count = scanner.nextInt()) > 0) {
                return count;
            } else {
                createErrorMessage();
                scanner.nextLine();
            }
        }
    }

    public static String getFoodName() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String text;
        while (true) {
            if (isFoodNameValid(text = scanner.nextLine())) {
                return text;
            } else {
                createErrorMessage();
            }
        }
    }

    public static double getFoodPrice() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        double price;
        while (true) {
            if (scanner.hasNextDouble() && checkNonNegative(price = scanner.nextDouble())) {
                return price;
            } else {
                createErrorMessage();
                scanner.nextLine();
            }
        }
    }

    public static boolean checkOnExit(String exit) {
        return exit.equalsIgnoreCase("завершить");
    }

    private static boolean checkNonNegative(double foodPrice) {
        return foodPrice > 0;
    }

    private static boolean isFoodNameValid(String text) {
        return !(text.trim().isEmpty());
    }

    private static void createErrorMessage() {
        System.out.println("Некорректное значение. Пожалуйста, введите заново:");
    }

}
