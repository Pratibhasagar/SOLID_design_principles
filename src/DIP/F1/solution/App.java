package DIP.F1.solution;

public class App {

    public static void main(String[] args) {

        RacingCar ferrari = new RacingCar(5);
        Driver driver = new Driver(ferrari);

        driver.increaseSpeed();
    }
}
