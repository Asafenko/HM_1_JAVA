package io_hm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {
    public static void main(String[] args) {
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;

        try {
            // Ввод путей к файлам с клавиатуры
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите путь к первому файлу: ");
            String filePath1 = inputReader.readLine();
            System.out.print("Введите путь ко второму файлу: ");
            String filePath2 = inputReader.readLine();

            // Чтение файлов
            reader1 = new BufferedReader(new FileReader(filePath1));
            reader2 = new BufferedReader(new FileReader(filePath2));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            int lineNumber = 1;

            while (line1 != null && line2 != null) {
                if (!line1.equals(line2)) {
                    System.out.println("Строка " + lineNumber + ":");
                    System.out.println("Из файла 1: " + line1);
                    System.out.println("Из файла 2: " + line2);
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
                if (reader2 != null) {
                    reader2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
