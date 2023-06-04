package OOP_hm_inheritance.Device;

public class Device {
    protected String name;
    protected String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void sound() {
        System.out.println("Device " + name + " is making a sound.");
    }

    public void show() {
        System.out.println("Device: " + name);
    }

    public void desc() {
        System.out.println("Description: " + description);
    }
}