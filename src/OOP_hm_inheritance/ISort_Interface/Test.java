package OOP_hm_inheritance.ISort_Interface;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = {43, 23, 12, 4, 2, 34, 54, 63, 12, 33, 2, 15, 4};

        System.out.println("Массив: " + Arrays.toString(arr));

        System.out.println("------------------------------");

        array.SortAsc(arr);
        System.out.println("Сортировка по возростанию: " + Arrays.toString(arr));

        System.out.println("------------------------------");

        array.SortDesc(arr);
        System.out.println("Сортировка по убыванию: " + Arrays.toString(arr));


    }


}
