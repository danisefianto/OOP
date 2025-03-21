import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

public class Main {
    public static void main(String[] args) {
        // karena method abstrak jadi tidak bisa dirunning
        // Animal Gajah = new Animal("Gajah", "Mamalia", "rumput");
        // Animal Macan = new Animal("Macan", "karnivore", "daging");
        // Abstrak jadi langsung panggil child
        Animal pitbull = new Dog("Shiba", "inu", "omnivore");
        Cat anggora = new Cat("Kocheng", "Mamalia", "whiskas", false, 9);
        // System.out.println(Gajah.name);
        // System.out.println(Macan.food);
        System.out.println(pitbull.species);
        pitbull.makeSound();
        anggora.makeSound();
        System.out.println(anggora.numberOfWhiskers);
        // // System.out.println(Gajah.getEnergy());
        // System.out.println(Gajah.ishungry());
    }
}
