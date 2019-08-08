package SRP.Animal.solution;

public class ZooHandler {

    void send(Animal animal) {
        System.out.println("Sending " + animal.name + "to zoo");
    }

    void release(Animal animal) {
        System.out.println("Releasing animal " + animal.name + " from zoo");
    }
}
