package OOP_hm_inheritance.Device;

public class Kettle extends Device {
    private double capacity;

    public Kettle(String name, String description, double capacity) {
        super(name, description);
        this.capacity = capacity;
    }

    public void sound() {
        System.out.println("Kettle " + name + " is whistling.");
    }
}
