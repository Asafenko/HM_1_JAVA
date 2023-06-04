package OOP_hm_inheritance.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5,false);
        Tiger tiger = new Tiger("Tiger", 3, true,"Amur tiger","Russia");

        animal.eat();
        animal.sleep();

        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());

        System.out.println("------------------------------------------");

        System.out.println(tiger.printInfo());

        tiger.eat();
        tiger.sleep();

        System.out.println("Name: " + tiger.getName());
        System.out.println("Age: " + tiger.getAge());

    }

}
