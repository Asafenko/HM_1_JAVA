package HomeWork_9_Thread;

import java.util.Random;

public class homework9_1 {
    private static final int ARRAY_SIZE = 10;
    private static int[] array = new int[ARRAY_SIZE];
    private static int sum;
    private static double average;

    public static void main(String[] args) throws InterruptedException {
        Thread fillThread = new Thread(() -> {
            fillArrayWithRandomNumbers();
        });

        Thread sumThread = new Thread(() -> {
            try {
                fillThread.join(); // Ожидаем завершения потока fillThread
                sum = calculateSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread averageThread = new Thread(() -> {
            try {
                fillThread.join(); // Ожидаем завершения потока fillThread
                average = calculateAverage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        fillThread.start();
        sumThread.start();
        averageThread.start();

        fillThread.join(); // Ожидаем завершения потока fillThread
        sumThread.join(); // Ожидаем завершения потока sumThread
        averageThread.join(); // Ожидаем завершения потока averageThread

        System.out.println("Массив: ");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nСумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }

    private static void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private static int calculateSum() {
        int sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static double calculateAverage() {
        int sum = calculateSum();
        return (double) sum / ARRAY_SIZE;
    }
}
