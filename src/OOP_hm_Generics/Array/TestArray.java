package OOP_hm_Generics.Array;

import javax.sound.midi.Soundbank;

public class TestArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 2, 7, 1, 9, 4, 3, 6, 8};
        Array<Integer> intTest = new Array<>();

        System.out.println("Enter from keyboard");
        intTest.keyboardInput(arr);
        System.out.println("Display");
        intTest.display(arr);

        System.out.println("Random numbers filling");
        intTest.randomFillNumbers(arr);
        System.out.println("Display");
        intTest.display(arr);

        System.out.println("MAX: " + intTest.maxNumber(arr));

        System.out.println("MIN: " + intTest.minNumber(arr));

        System.out.println("AVG: " + intTest.avgNumber(arr));

        System.out.println("Sort to down");
        intTest.sortToDown(arr);
        intTest.display(arr);

        System.out.println("Sort to up");
        intTest.sortToUp(arr);
        intTest.display(arr);

        System.out.println("Binary Search");
        int answer = intTest.binarySearch(arr, 7);
        if (answer != -1) {
            System.out.println("Элемент " + 7 + " найден по индексу " + answer);
        } else {
            System.out.println("Элемент " + 7 + " не найден");
        }

        System.out.println("Change By Index");
        intTest.changeByIndex(arr,2,1000);
        intTest.display(arr);

        System.out.println("Change old value to new value");
        intTest.changeToNewValue(arr,1000,2000);
        intTest.display(arr);
    }
}
