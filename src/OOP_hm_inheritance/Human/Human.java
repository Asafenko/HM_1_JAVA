package OOP_hm_inheritance.Human;

public class Human {

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected String name;
    protected String surname;
    protected int age;


    public String printInfo() {
        return "Human{ " +
                "Name= '" + name + '\'' +
                ", Surname= '" + surname + '\'' +
                ", Age= " + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
