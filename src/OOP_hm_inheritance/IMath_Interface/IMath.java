package OOP_hm_inheritance.IMath_Interface;

public interface IMath<T extends Comparable<T>>{
    T Max();
    T Min();
    float Avg();
}
