package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Mustang", "Gasolina");

        car1.start();
        car1.start();

        car1.accelerate();
        car1.accelerate();

        car1.stop();

        for (int i = 0; i < 30; i++) {
            car1.accelerate();
        }

        car1.brake();
        for (int i = 0; i < 30; i++) {
            car1.brake();
        }

        car1.turnAngleOfWheels(20);
        car1.turnAngleOfWheels(60);
        car1.turnAngleOfWheels(-220);

        car1.setReverse(true);
        for (int i = 0; i < 30; i++) {
            car1.brake();
        }
        car1.setReverse(true);

        car1.showDetails();


    }

}