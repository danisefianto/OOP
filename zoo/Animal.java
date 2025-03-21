package zoo;

public abstract class Animal {
    public String name;
    public String species;
    public String food;
    private int energy = 30;
    private int hungerLevel = 0;

    // constructor paramater
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
    // public boolean ishungry() {
    // return this.energy <= 0;
    // }

    // Tell Dont ask
    public boolean ishungry() {
        return this.hungerLevel >= 50;
    }

    public boolean isTired() {
        return this.energy < 10;
    }

    public void sleep() {
        this.energy++;
        this.hungerLevel++;
    }

    // method abstract

    public abstract void makeSound();

}
