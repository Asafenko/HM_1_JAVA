package OOP_hm_inheritance.IMath_Interface;

public class Array<T extends Comparable<T>> implements IMath<T> {
    private T[] array;
    public Array(T[] array){

        this.array = array;
    }

    @Override
    public T Max() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0)
                max = array[i];
        }
        return max;
    }

    @Override
    public T Min() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0)
                min = array[i];
        }
        return min;
    }

    @Override
    public float Avg() {
        float sum = 0;
        for (T n : array) {
            sum += Float.parseFloat(n.toString());
        }
        return sum / array.length;
    }
}
