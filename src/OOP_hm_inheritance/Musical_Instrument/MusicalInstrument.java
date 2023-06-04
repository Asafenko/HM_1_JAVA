package OOP_hm_inheritance.Musical_Instrument;

public class MusicalInstrument {
    protected String name;
    protected String description;
    protected String history;

    public MusicalInstrument(String name, String description, String history) {
        this.name = name;
        this.description = description;
        this.history = history;
    }

    public void sound() {
        System.out.println(name + " is making sound.");
    }

    public void desc() {
        System.out.println("Description: " + description);
    }

    public void history() {
        System.out.println("History: " + history);
    }

    public void show() {
        System.out.println("Musical Instrument: " + name);
    }
}
