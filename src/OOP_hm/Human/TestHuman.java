package OOP_hm.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human person = new Human("John","Wick");
        Human person2 = new Human("James","Bond");
        Human person3 = new Human("Robert","McCall");

        person.showInfo();
        person.showInfo(person,5);
        person.showInfo(person.name);
    }
}
