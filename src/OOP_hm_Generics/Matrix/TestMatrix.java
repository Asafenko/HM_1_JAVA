package OOP_hm_Generics.Matrix;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix<Integer> matrix = new Matrix<>(4,2);

//        matrix.keyboardInput();
//        matrix.display();

        matrix.randomFillNumbers();
        matrix.display();

        System.out.println("MAX: " + matrix.maxNumber());


        System.out.println("MIN: " + matrix.minNumber());

        System.out.println("AVG: " + matrix.avgNumber());

    }
}
