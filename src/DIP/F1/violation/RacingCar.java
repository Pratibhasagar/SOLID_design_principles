package DIP.F1.violation;

class RacingCar {

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    void accelerate(){
        power++;
        remainingFuel--;
    }

}