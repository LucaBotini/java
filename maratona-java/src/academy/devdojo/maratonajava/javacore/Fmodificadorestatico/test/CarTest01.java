package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setSpeedLimit(180);

        Car car = new Car("BMW", 280);
        Car car2 = new Car("Honda", 360);
        Car car3 = new Car("Mercedes", 295);
        car.print();
        car2.print();
        car3.print();

    }
}
