package HomeWork_8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class homework8_2 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList(
                "яблоко", "банан", "апельсин", "молоко", "сыр",
                "яйца", "яблоко", "банан", "хлеб", "масло"
        );

        // 1. Показать все продукты
        System.out.println("Все продукты: ");
        products.stream()
                .forEach(System.out::println);

        // 2. Показать все продукты с названием меньше 5 символов
        System.out.println("Продукты с названием меньше 5 символов: ");
        products.stream()
                .filter(product -> product.length() < 5)
                .forEach(System.out::println);

        // 3. Посчитать, сколько раз встречается продукт, чьё название ввёл пользователь
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название продукта: ");
        String userInput = scanner.nextLine();
        long count = products.stream()
                .filter(product -> product.equals(userInput))
                .count();
        System.out.println("Продукт \"" + userInput + "\" встречается " + count + " раз(а)");

        // 4. Показать все продукты, которые начинаются на заданную букву
        System.out.print("Введите букву: ");
        String letter = scanner.nextLine();
        System.out.println("Продукты, начинающиеся на букву \"" + letter + "\": ");
        products.stream()
                .filter(product -> product.startsWith(letter))
                .forEach(System.out::println);

        // 5. Показать все продукты из категории "молоко"
        System.out.println("Продукты из категории \"молоко\": ");
        products.stream()
                .filter(product -> product.equals("молоко"))
                .forEach(System.out::println);
    }
}
