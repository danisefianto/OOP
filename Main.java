import zoo.Animal;

public class Main {
    public static void main(String[] args) {
        Animal Gajah = new Animal("Gajah", "Mamalia", "rumput");
        Animal Macan = new Animal("Macan", "karnivore", "daging");
        System.out.println(Gajah.name);
        System.out.println(Macan.food);
        // System.out.println(Gajah.getEnergy());
        System.out.println(Gajah.ishungry());
    }
}
