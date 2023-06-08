package OOP_hm_Generics.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<T extends Comparable<T>> {

    //    private T[] array;

    //    public Array(int size){
    //        this.array = (T[]) new Comparable[size];
    //    }


    public void keyboardInput(T[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("index: " + i + "\nenter: ");
            array[i] = (T) Integer.valueOf(scanner.next());
        }
    }

    public void randomFillNumbers(T[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = (T) Integer.valueOf(random.nextInt(-300, 300));
    }

    public void display(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public T maxNumber(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0)
                max = array[i];
        }
        return max;
    }

    public T minNumber(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0)
                min = array[i];
        }
        return min;
    }

    public float avgNumber(T[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Float.parseFloat(array[i].toString());
        }
        return sum / array.length;
    }

    public void sortToUp(T[] array) { // Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                }
            }
        }
    }

    public void sortToDown(T[] array) { // Arrays.sort(array, Comparator.reverseOrder());
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    T num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                }
            }
        }
    }

    public int binarySearch(T[] array, T value) { // Arrays.binarySearch(array, value);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid].compareTo(value) == 0) {
                return mid;
            }

            if (array[mid].compareTo(value) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Возвращает -1, если элемент не найден
    }

    public void changeByIndex(T[] array, int index, T value) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = value;
            }
        }
    }

    public void changeToNewValue(T[] array, T oldV, T newV){
        for(int i = 0;i < array.length; i++){
            if(array[i].equals(oldV))
                array[i]= newV;
        }
    }

}


