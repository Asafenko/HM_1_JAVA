package OOP_hm_inheritance.Device;

public class Steamboat extends Device {
    private int displacement;

    public Steamboat(String name, String description, int displacement) {
        super(name, description);
        this.displacement = displacement;
    }

    public void sound() {
        System.out.println("Steamboat " + name + " is sounding its horn.");
    }
}
