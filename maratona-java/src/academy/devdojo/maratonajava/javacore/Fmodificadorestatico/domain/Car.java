package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Car {
    private String name;
    private double speedMax;
    private static double speedLimit = 250;

    public Car(String name, double speedMax) {
        this.name = name;
        this.speedMax = speedMax;
    }

    public void print() {
        System.out.println("-------");
        System.out.println("Name: " + this.name);
        System.out.println("Speed max: " + this.speedMax);
        System.out.println("Speed limit: " + Car.speedLimit);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(double speedMax) {
        this.speedMax = speedMax;
    }

    public static double getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }
}

