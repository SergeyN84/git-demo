package example.builders.cars;

import example.builders.components.Engine;
import example.builders.components.Transmission;

public class Car {

    final CarType carType;
    final int seats;
    final Engine engine;
    final Transmission transmission;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }
}
