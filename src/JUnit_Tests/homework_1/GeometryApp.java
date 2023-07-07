package JUnit_Tests.homework_1;

import java.util.Scanner;

import static JUnit_Tests.homework_1.shapes.*;

public class GeometryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру для расчета площади:");
        System.out.println("1. Треугольник");
        System.out.println("2. Прямоугольник");
        System.out.println("3. Квадрат");
        System.out.println("4. Ромб");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double base, height;
                System.out.println("Введите основание треугольника:");
                base = scanner.nextDouble();
                System.out.println("Введите высоту треугольника:");
                height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Площадь треугольника: " + triangle.calculateArea());
                break;
            case 2:
                double length, width;
                System.out.println("Введите длину прямоугольника:");
                length = scanner.nextDouble();
                System.out.println("Введите ширину прямоугольника:");
                width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
                break;
            case 3:
                double side;
                System.out.println("Введите сторону квадрата:");
                side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Площадь квадрата: " + square.calculateArea());
                break;
            case 4:
                double diagonal1, diagonal2;
                System.out.println("Введите диагональ 1 ромба:");
                diagonal1 = scanner.nextDouble();
                System.out.println("Введите диагональ 2 ромба:");
                diagonal2 = scanner.nextDouble();
                Rhombus rhombus = new Rhombus(diagonal1, diagonal2);
                System.out.println("Площадь ромба: " + rhombus.calculateArea());
                break;
            default:
                System.out.println("Некорректный выбор.");
        }

        scanner.close();
    }
}
