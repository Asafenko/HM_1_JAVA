package OOP_hm_Generics.Matrix;

public class TestMatrix {
    public static void main(String[] args) throws IllegalAccessException {
        Matrix<Integer> matrix1 = new Matrix<>(2,2);
        Matrix<Integer> matrix2 = new Matrix<>(2,2);

        matrix1.keyboardInput();
        matrix1.display();
        System.out.println("---------------------------");
        matrix2.keyboardInput();
        matrix2.display();

        System.out.println("---------------------------");

       Matrix<Integer> resultMatrix =  matrix1.division(matrix2);
        System.out.println("result Matrix");
       resultMatrix.display();

//        matrix.randomFillNumbers();
//        matrix.display();

//        System.out.println("MAX: " + matrix.maxNumber());
//
//        System.out.println("MIN: " + matrix.minNumber());
//
//        System.out.println("AVG: " + matrix.avgNumber());



    }
}
