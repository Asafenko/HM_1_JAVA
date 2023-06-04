package OOP_hm_inheritance.IMath_Interface;

public class Array implements IMath {
    @Override
    public int Max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    @Override
    public int Min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    @Override
    public float Avg(int array[]) {
        float sum=0;
        for (int n : array) {
            sum+=n;
        }
        return sum/array.length;
    }
}
