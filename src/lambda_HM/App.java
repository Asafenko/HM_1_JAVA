package lambda_HM;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {

        // Задание 1

        //1.1
        interface LeapYearChecker {
            boolean isLeapYear(int year);
        }

        LeapYearChecker leapYearChecker = year -> (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int year = 2020;
        System.out.println(leapYearChecker.isLeapYear(year));


        //1.2
        interface DaysBetweenCalculator {
            long calculateDaysBetween(LocalDate startDate, LocalDate endDate);
        }

        DaysBetweenCalculator daysBetweenCalculator = (startDate, endDate) -> ChronoUnit.DAYS.between(startDate, endDate);
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 10);
        System.out.println(daysBetweenCalculator.calculateDaysBetween(startDate, endDate));

        //1.3
        interface FullWeeksCalculator {
            long calculateFullWeeks(LocalDate startDate, LocalDate endDate);
        }

        FullWeeksCalculator fullWeeksCalculator = (startDate2, endDate2) -> ChronoUnit.WEEKS.between(startDate, endDate);
        LocalDate startDate2 = LocalDate.of(2023, 1, 1);
        LocalDate endDate2 = LocalDate.of(2023, 1, 21);
        System.out.println(fullWeeksCalculator.calculateFullWeeks(startDate, endDate));

        //1.4
        interface DayOfWeekCalculator {
            DayOfWeek calculateDayOfWeek(String date, String pattern);
        }

        DayOfWeekCalculator dayOfWeekCalculator = (date, pattern) -> {
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
            return localDate.getDayOfWeek();
        };
        String date = "20 июля 1969";
        String pattern = "dd MMMM yyyy";
        System.out.println(dayOfWeekCalculator.calculateDayOfWeek(date, pattern));


        //Задание 2

        //2.1
        interface FractionAdder {
            double addFractions(double numerator1, double denominator1, double numerator2, double denominator2);
        }

        FractionAdder fractionAdder = (numerator1, denominator1, numerator2, denominator2) -> {
            double sum = (numerator1 / denominator1) + (numerator2 / denominator2);
            return sum;
        };
        double numerator1 = 1;
        double denominator1 = 2;
        double numerator2 = 1;
        double denominator2 = 3;
        System.out.println(fractionAdder.addFractions(numerator1, denominator1, numerator2, denominator2));

        //2.2
        interface FractionSubtractor {
            double subtractFractions(double numerator1, double denominator1, double numerator2, double denominator2);
        }

        FractionSubtractor fractionSubtractor = (numerator11, denominator11, numerator22, denominator22) -> {
            double difference = (numerator11 / denominator11) - (numerator22 / denominator22);
            return difference;
        };
        double numerator11 = 3;
        double denominator11 = 4;
        double numerator22 = 1;
        double denominator22 = 2;
        System.out.println(fractionSubtractor.subtractFractions(numerator11, denominator11, numerator22, denominator22));


        //2.3
        interface FractionMultiplier {
            double multiplyFractions(double numerator1, double denominator1, double numerator2, double denominator2);
        }

        FractionMultiplier fractionMultiplier = (numerator111, denominator111, numerator222, denominator222) -> {
            double product = (numerator111 / denominator111) * (numerator222 / denominator222);
            return product;
        };
        double numerator111 = 2;
        double denominator111 = 3;
        double numerator222= 3;
        double denominator222 = 5;
        System.out.println(fractionMultiplier.multiplyFractions(numerator111, denominator111, numerator222, denominator222));

        //2.4
        interface FractionDivider {
            double divideFractions(double numerator1, double denominator1, double numerator2, double denominator2);
        }
        FractionDivider fractionDivider = (numerator1111, denominator1111, numerator2222, denominator2222) -> {
            double quotient = (numerator1111 / denominator1111) / (numerator2222 / denominator2222);
            return quotient;
        };
        double numerator1111 = 5;
        double denominator1111 = 4;
        double numerator2222 = 3;
        double denominator2222 = 2;
        System.out.println(fractionDivider.divideFractions(numerator1111, denominator1111, numerator2222, denominator2222));


        //Задание 3

        //3.1
        interface MaxValueFinder {
            <T extends Comparable<T>> T findMax(T value1, T value2, T value3, T value4);
        }

        MaxValueFinder maxValueFinder = (MaxValueFinder) BinaryOperator.maxBy(Comparator.naturalOrder());
        int value1 = 5;
        int value2 = 3;
        int value3 = 8;
        int value4 = 2;
        System.out.println(maxValueFinder.findMax(value1, value2, value3, value4));


        //3.2
        interface MinValueFinder {
            <T extends Comparable<T>> T findMin(T value1, T value2, T value3, T value4);
        }

        MinValueFinder minValueFinder = (MinValueFinder) BinaryOperator.minBy(Comparator.naturalOrder());
        int value11 = 5;
        int value22 = 3;
        int value33 = 8;
        int value44 = 2;
        System.out.println(maxValueFinder.findMax(value11, value22, value33, value44));








    }
}
