package OOP_hm_inheritance.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human person = new Human("Name","Surname",99);
        person.setName("John");
        person.setSurname("Wick");
        person.setAge(40);

        System.out.println(person.printInfo());

        Builder builder=new Builder("Name","Surname",44,"Builder",2.5);
        System.out.println(builder.printInfo());
    }
}
