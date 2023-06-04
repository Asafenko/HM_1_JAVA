package OOP_hm_inheritance.Device;

public class TestDevice {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Kettle", "A device used for boiling water", 1.5);
        Microwave microwave = new Microwave("Microwave", "A device used for heating food", 1000);
        Steamboat steamboat = new Steamboat("Steamboat", "A boat powered by steam", 5000);

        kettle.show();
        kettle.desc();
        kettle.sound();

        System.out.println("---------------------------------------");

        microwave.show();
        microwave.desc();
        microwave.sound();

        System.out.println("---------------------------------------");

        steamboat.show();
        steamboat.desc();
        steamboat.sound();
    }
}
