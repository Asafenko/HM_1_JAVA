package OOP_hm_inheritance.Animal;

public class Tiger extends Animal {

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    String population;
    String habitat;

    public String printInfo() {
        return "Tiger{ " +
                "Population= '" + population + '\'' +
                ", Habitat= '" + habitat + '\'' +
                ", Name= '" + name + '\'' +
                ", Age= " + age +
                ", Wild= " + wild +
                '}';
    }

    public Tiger(String name, int age, boolean wild, String population, String habitat) {
        super(name, age, wild);
        this.population = population;
        this.habitat = habitat;
    }
}
