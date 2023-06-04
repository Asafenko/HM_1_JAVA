package OOP_hm_inheritance.Human;

public class Builder extends Human {

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    String job;
    double experience;

    public String printInfo() {
        return "Builder{" +
                "Job='" + job + '\'' +
                ", Experience=" + experience + " year "+
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                '}';
    }

    public Builder(String name, String surname, int age, String job, double experience) {
        super(name, surname, age);
        this.job = job;
        this.experience = experience;
    }




}
