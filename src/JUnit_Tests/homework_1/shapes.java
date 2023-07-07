package JUnit_Tests.homework_1;

public class shapes {

    public static class Triangle {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double calculateArea() {
            return 0.5 * base * height;
        }
    }
    public static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double calculateArea() {
            return length * width;
        }
    }
    public static class Square {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double calculateArea() {
            return side * side;
        }
    }
    public static class Rhombus {
        private double diagonal1;
        private double diagonal2;

        public Rhombus(double diagonal1, double diagonal2) {
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }

        public double getDiagonal1() {
            return diagonal1;
        }

        public void setDiagonal1(double diagonal1) {
            this.diagonal1 = diagonal1;
        }

        public double getDiagonal2() {
            return diagonal2;
        }

        public void setDiagonal2(double diagonal2) {
            this.diagonal2 = diagonal2;
        }

        public double calculateArea() {
            return 0.5 * diagonal1 * diagonal2;
        }
    }
}
