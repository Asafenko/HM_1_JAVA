package OOP_hm_Generics.Matrix;

import OOP_hm_inheritance.IMath_Interface.Array;

import java.util.Random;
import java.util.Scanner;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = (T[][]) new Number[rows][columns];
    }

    public void keyboardInput() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Row position: [" + i + "] \nColumn position: [" + j + "]");
                matrix[i][j] = (T) Integer.valueOf(scanner.next());
            }
        }
    }


    public void randomFillNumbers() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (T) Integer.valueOf(random.nextInt(-100, 100));
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public T maxNumber() {
        T max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j].intValue() > max.intValue())
                    max = matrix[i][j];
            }
        }
        return max;
    }

    public T minNumber() {
        T min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j].intValue() < min.intValue())
                    min = matrix[i][j];
            }
        }
        return min;
    }

    public float avgNumber() {
        float sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += Float.parseFloat(matrix[i][j].toString());
            }
        }
            return sum / (rows * columns);
    }
}