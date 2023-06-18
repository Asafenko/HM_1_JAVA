package io_hm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int maxLength = 0;
        String longestLine = "";

        try {
            // Ввод пути к файлу с клавиатуры
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите путь к файлу: ");
            String filePath = inputReader.readLine();

            // Чтение файла
            reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();
            while (line != null) {
                if (line.length() > maxLength) {
                    maxLength = line.length();
                    longestLine = line;
                }
                line = reader.readLine();
            }

            System.out.println("Самая длинная строка: " + longestLine);
            System.out.println("Длина строки: " + maxLength);
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
