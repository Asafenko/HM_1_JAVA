package OOP_hm_inheritance.IMath_Interface;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Array array = new Array();

        int[] arr={44,55,2,121,32,56,3,12,4,5,432,0};

        int max = array.Max(arr);
        int min = array.Min(arr);
        float avg = array.Avg(arr);

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + avg);
    }
}
