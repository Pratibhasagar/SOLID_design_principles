package ISP.Birds.violation;


public class Crow implements Bird {

    String currentLocation;
    int numberOfFeathers;

    public Crow(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
