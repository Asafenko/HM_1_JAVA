package HomeWork_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class homework8_1 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(100); // Генерируем 100 случайных чисел

        // Количество положительных чисел
        long positiveCount = numbers.stream()
                .filter(number -> number > 0)
                .count();
        System.out.println("Количество положительных чисел: " + positiveCount);

        // Количество отрицательных чисел
        long negativeCount = numbers.stream()
                .filter(number -> number < 0)
                .count();
        System.out.println("Количество отрицательных чисел: " + negativeCount);

        // Количество двузначных чисел
        long twoDigitCount = numbers.stream()
                .filter(number -> number >= 10 && number <= 99)
                .count();
        System.out.println("Количество двузначных чисел: " + twoDigitCount);

        // Количество зеркальных чисел
        long palindromeCount = numbers.stream()
                .filter(homework8_1::isPalindrome)
                .count();
        System.out.println("Количество зеркальных чисел: " + palindromeCount);
    }

    // Метод для проверки, является ли число палиндромом
    private static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        String reversedNumberString = new StringBuilder(numberString).reverse().toString();
        return numberString.equals(reversedNumberString);
    }

    // Метод для генерации заданного количества случайных чисел
    private static List<Integer> generateRandomNumbers(int count) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }
}
