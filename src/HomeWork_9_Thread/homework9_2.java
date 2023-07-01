package HomeWork_9_Thread;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class homework9_2 {
    private static final int THREAD_COUNT = 3;
    private static List<Integer> primes = new ArrayList<>();
    private static List<Long> factorials = new ArrayList<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите путь к файлу: ");
        String filePath = reader.readLine();

        File file = new File(filePath);

        Thread fillThread = new Thread(() -> fillFileWithRandomNumbers(file));
        Thread primeThread = new Thread(() -> findPrimeNumbers(file));
        Thread factorialThread = new Thread(() -> findFactorials(file));

        fillThread.start();
        primeThread.start();
        factorialThread.start();

        fillThread.join();
        primeThread.join();
        factorialThread.join();

        System.out.println("Статистика выполненных операций:");
        System.out.println("Простые числа: " + primes);
        System.out.println("Факториалы: " + factorials);
    }

    private static void fillFileWithRandomNumbers(File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < THREAD_COUNT; i++) {
                writer.println(random.nextInt(100));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void findPrimeNumbers(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (isPrime(number)) {
                    synchronized (primes) {
                        primes.add(number);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findFactorials(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                long factorial = calculateFactorial(number);
                synchronized (factorials) {
                    factorials.add(factorial);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
