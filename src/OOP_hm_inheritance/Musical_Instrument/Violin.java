package OOP_hm_inheritance.Musical_Instrument;

class Violin extends MusicalInstrument {
    public Violin(String name, String description, String history) {
        super(name, description, history);
    }

    public void sound() {
        System.out.println("Violin is playing melodious music.");
    }
}