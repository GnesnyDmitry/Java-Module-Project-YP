import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите количество людей, на которых нужно разделить счет:");

        int peopleCount = Validator.getPeopleCount();


        ProductManager manager = new ProductManager();
        while (true) {
            System.out.println("Введите название товара:");
            String foodName = Validator.getFoodName();

            System.out.println("Введите стоимость товара в формате рубли,копейки (например 10,45 или 11,40):");
            double foodPrice = Validator.getFoodPrice();

            Food food = new Food(foodName, foodPrice);
            manager.addFood(food);
            System.out.println("Вы ввели товар: " + foodName);
            System.out.println("Стоимость товара: " + RubFormat.rubFormat(foodPrice));

            System.out.println("Если не хотите добавлять товар: " + "'" + "Завершить" + "' " + "или любой символ, чтобы добавить еще");
            String exit = scanner.next();
            if (Validator.checkOnExit(exit)) {
                    manager.printFoods();
                break;
            }
        }

        double total = Calculator.divider(manager.getListOfFood(), peopleCount);

        System.out.println("Каждый должен заплатить по: " + RubFormat.rubFormat(total));
    }







}