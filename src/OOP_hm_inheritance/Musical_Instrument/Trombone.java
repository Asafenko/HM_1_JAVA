package OOP_hm_inheritance.Musical_Instrument;

class Trombone extends MusicalInstrument {
    public Trombone(String name, String description, String history) {
        super(name, description, history);
    }

    public void sound() {
        System.out.println("Trombone is producing deep and rich tones.");
    }
}
