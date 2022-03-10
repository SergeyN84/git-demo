package example.builders;

import example.builders.builders.CarManualBuilder;
import example.builders.cars.Car;
import example.builders.builders.CarBuilder;
import example.builders.cars.Manual;
import example.builders.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructCityCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructCityCar(manualBuilder);
        Manual carManual  = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
