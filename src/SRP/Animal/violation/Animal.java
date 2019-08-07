package SRP.Animal.violation;

public class Animal {

    String name;

    void saveToZoo() {
        System.out.println("Saving " + this.name + "to zoo.");
    }

    void releaseAnimal() {
        System.out.println("Releasing animal " + this.name + " from zoo. Yoohoo!! ");
    }
}
