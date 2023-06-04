package OOP_hm_inheritance.Musical_Instrument;

public class TestMusicalInstrument {
    public static void main(String[] args) {
        Violin violin = new Violin("Violin", "A string instrument", "The violin has a long history and is widely used in classical music.");
        Trombone trombone = new Trombone("Trombone", "A brass instrument", "The trombone is often used in jazz and classical music.");

        violin.show();
        violin.desc();
        violin.history();
        violin.sound();
        System.out.println("---------------------------------");
        trombone.show();
        trombone.desc();
        trombone.history();
        trombone.sound();
    }
}
