package zoo;

public class Cat extends Animal {
    public boolean hasFur;
    public int numberOfWhiskers;
    private int lives = 9;

    // constructor paramter
    public Cat(String name, String species, String food, boolean hasFur, int whiskers) {
        super(name, species, food);
        // TODO Auto-generated constructor stub
        this.hasFur = hasFur;
        this.numberOfWhiskers = whiskers;

    }

    // polymorphism
    public void makeSound() {
        System.out.println("Meong");
    }

}
