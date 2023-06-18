package io_hm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork3 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        List<int[]> arrays = new ArrayList<>();

        try {
            // Ввод пути к файлу с клавиатуры
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите путь к файлу!");
            String filePath = inputReader.readLine();
            // Чтение файла
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            while (line != null) {
                String[] elements = line.split(" ");
                int[] array = new int[elements.length];

                for (int i = 0; i < elements.length; i++) {
                    array[i] = Integer.parseInt(elements[i]);
                }

                arrays.add(array);
                line = reader.readLine();
            }

            // Вывод массивов
            int totalSum = 0;
            int overallMin = Integer.MAX_VALUE;
            int overallMax = Integer.MIN_VALUE;

            for (int i = 0; i < arrays.size(); i++) {
                int[] array = arrays.get(i);
                int sum = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                System.out.println("Массив " + (i + 1) + ": " + Arrays.toString(array));

                for (int num : array) {
                    sum += num;
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                    if (num < overallMin) {
                        overallMin = num;
                    }
                    if (num > overallMax) {
                        overallMax = num;
                    }
                }

                System.out.println("Сумма элементов: " + sum);
                System.out.println("Минимальное значение: " + min);
                System.out.println("Максимальное значение: " + max);
                System.out.println();
                totalSum += sum;
            }

            System.out.println("Минимальное значение среди всех массивов: " + overallMin);
            System.out.println("Максимальное значение среди всех массивов: " + overallMax);
            System.out.println("Общая сумма всех массивов: " + totalSum);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
