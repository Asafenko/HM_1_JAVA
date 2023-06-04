package OOP_hm_inheritance.Animal;

public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public Animal(String name, int age, boolean wild) {
        this.name = name;
        this.age = age;
        this.wild = wild;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }


    public String printInfo() {
        return "Animal{ " +
                "Name= '" + name + '\'' +
                ", Age= " + age +
                ", Wild= " + wild +
                '}';
    }

    String name;
    int age;
    boolean wild;
}
