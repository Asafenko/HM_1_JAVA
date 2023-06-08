package OOP_hm_inheritance.IMath_Interface;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Double[] arr={44.,55.,2.,121.,32.,56.,37.,1.2,48.,5.,43.2};
        Array array = new Array(arr);

        var max = array.Max();
        var min = array.Min();
        float avg = array.Avg();

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + avg);
    }
}
