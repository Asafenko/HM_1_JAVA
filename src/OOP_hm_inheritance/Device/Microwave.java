package OOP_hm_inheritance.Device;

public class Microwave extends Device {
    private int power;

    public Microwave(String name, String description, int power) {
        super(name, description);
        this.power = power;
    }

    public void sound() {
        System.out.println("Microwave " + name + " is beeping.");
    }
}
