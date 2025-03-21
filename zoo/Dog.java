package zoo;

public class Dog extends Animal {

    public Dog(String name, String species, String food) {
        super(name, species, food);
        // TODO Auto-generated constructor stub
    }

    // polymorphism
    public void makeSound() {
        System.out.println("Meong");
    }

}
