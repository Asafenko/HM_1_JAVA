package JUnit_Tests.homework_2;

public class CurrencyConverter {
    public static final int DOLLAR = 1;
    public static final int EURO = 2;
    public static final int POUND = 3;
    public static final int YEN = 4;

    private double dollarRate;
    private double euroRate;
    private double poundRate;
    private double yenRate;

    public CurrencyConverter(double dollarRate, double euroRate, double poundRate, double yenRate) {
        this.dollarRate = dollarRate;
        this.euroRate = euroRate;
        this.poundRate = poundRate;
        this.yenRate = yenRate;
    }

    public double convertToDollars(double amount, int currency) {
        double convertedAmount = 0;

        switch (currency) {
            case EURO:
                convertedAmount = amount / euroRate;
                break;
            case POUND:
                convertedAmount = amount / poundRate;
                break;
            case YEN:
                convertedAmount = amount / yenRate;
                break;
            default:
                convertedAmount = amount;
        }

        return convertedAmount;
    }

    public double convertFromDollars(double amount, int currency) {
        double convertedAmount = 0;

        switch (currency) {
            case EURO:
                convertedAmount = amount * euroRate;
                break;
            case POUND:
                convertedAmount = amount * poundRate;
                break;
            case YEN:
                convertedAmount = amount * yenRate;
                break;
            default:
                convertedAmount = amount;
        }

        return convertedAmount;
    }
}