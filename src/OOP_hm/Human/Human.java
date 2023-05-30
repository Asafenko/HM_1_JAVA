package OOP_hm.Human;

public class Human {
   public String name;
   private String surname;

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
