package JUnit_Tests.homework_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static JUnit_Tests.homework_1.shapes.*;
import static org.junit.jupiter.api.Assertions.*;

class shapesTest {
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(5, 10);
        double expectedArea = 0.5 * 5 * 10;
        Assertions.assertEquals(expectedArea, triangle.calculateArea());
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        double expectedArea = 4 * 6;
        Assertions.assertEquals(expectedArea, rectangle.calculateArea());
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(7);
        double expectedArea = 7 * 7;
        Assertions.assertEquals(expectedArea, square.calculateArea());
    }

    @Test
    public void testRhombusArea() {
        Rhombus rhombus = new Rhombus(8, 12);
        double expectedArea = 0.5 * 8 * 12;
        Assertions.assertEquals(expectedArea, rhombus.calculateArea());
    }
}