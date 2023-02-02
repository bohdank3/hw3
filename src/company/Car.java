package company;

public class Car {
    private void startElectricity() {
        System.out.println("Electircity ON");
    }

    private void startCommand() {
        System.out.println("OK");
    }

    private void startFuelSystem() {
        System.out.println("start");
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
