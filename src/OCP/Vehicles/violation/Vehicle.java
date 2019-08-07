package OCP.Vehicles.violation;

public class Vehicle {

    private int power;
    private int suspensionHeight;

    int getPower() {
        return power;
    }

    int getSuspensionHeight() {
        return suspensionHeight;
    }

    void setPower(final int power) {
        this.power = power;
    }

    void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

}