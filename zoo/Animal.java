package zoo;

public class Animal {
    public String name;
    public String species;
    public String food;
    private int energy;

    public Animal(String name, String species, String food)

    {
        this.name = name;
        this.species = species;
        this.food = food;

    }

    // Breaking Encapsulation
    // public void setEnergy(int energy) {
    // this.energy = energy;
    // }

    // public int getEnergy() {
    // return this.energy;
    // }

    // Tell Dont ask
    public boolean ishungry() {
        return this.energy <= 0;
    }
}
