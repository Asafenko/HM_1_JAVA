package io_hm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        System.out.print("Введите элементы массива через пробел: ");
        String arrayInput = scanner.nextLine();
        int[] array = parseArray(arrayInput);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Запись исходного массива в первую строку файла
            writer.write(arrayToString(array));
            writer.newLine();

            // Запись чётных значений во вторую строку файла
            writer.write(arrayToString(getEvenValues(array)));
            writer.newLine();

            // Запись нечётных значений в третью строку файла
            writer.write(arrayToString(getOddValues(array)));
            writer.newLine();

            // Запись перевёрнутого массива в четвёртую строку файла
            writer.write(arrayToString(reverseArray(array)));
            writer.newLine();

            System.out.println("Массив и другие данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static int[] parseArray(String input) {
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        return array;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private static int[] getEvenValues(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] evenValues = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenValues[index] = num;
                index++;
            }
        }
        return evenValues;
    }

    private static int[] getOddValues(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        int[] oddValues = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddValues[index] = num;
                index++;
            }
        }
        return oddValues;
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}
