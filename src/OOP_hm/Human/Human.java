package OOP_hm.Human;

public class Human {
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

     String name;
     String surname;

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void showInfo(){
        System.out.println(name + " " + surname);
    }
    public void showInfo(Human person,int times){
        for (; times > 0; times--){
            System.out.println(person.name);
        }
    }
    public void showInfo(String str){
        System.out.println(str + "Hello !!!");
    }
}
