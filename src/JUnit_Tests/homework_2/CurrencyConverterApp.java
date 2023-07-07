package JUnit_Tests.homework_2;

import java.util.Currency;
import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите доллары:");
        double usdRate = scanner.nextDouble();

        System.out.println("Введите коэффициент конвертации из доллара в евро:");
        double usdToEuroRate = scanner.nextDouble();

        System.out.println("Введите коэффициент конвертации из доллара в фунт стерлингов:");
        double usdToPoundRate = scanner.nextDouble();

        System.out.println("Введите коэффициент конвертации из доллара в йену:");
        double usdToYenRate = scanner.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(usdRate,usdToEuroRate, usdToPoundRate, usdToYenRate);

        System.out.println("Выберите операцию:");
        System.out.println("1. Конвертировать из долларов в выбранную валюту");
        System.out.println("2. Конвертировать из выбранной валюты в доллары");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите сумму в долларах:");
                double dollarsAmount = scanner.nextDouble();
                System.out.println("Выберите валюту для конвертации:");
                System.out.println("1. Евро");
                System.out.println("2. Фунт стерлингов");
                System.out.println("3. Йена");
                int currencyChoice = scanner.nextInt();
                double convertedAmount = converter.convertFromDollars(dollarsAmount, currencyChoice);
                System.out.println("Сумма в выбранной валюте: " + convertedAmount);
                break;
            case 2:
                System.out.println("Введите сумму в выбранной валюте:");
                double currencyAmount = scanner.nextDouble();
                System.out.println("Выберите валюту, в которую нужно конвертировать:");
                System.out.println("1. Евро");
                System.out.println("2. Фунт стерлингов");
                System.out.println("3. Йена");
                int targetCurrencyChoice = scanner.nextInt();
                double convertedDollarsAmount = converter.convertToDollars(currencyAmount, targetCurrencyChoice);
                System.out.println("Сумма в долларах: " + convertedDollarsAmount);
                break;
            default:
                System.out.println("Некорректный выбор операции.");
        }

        scanner.close();
    }
}
