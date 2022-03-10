package example.builders.cars;

import example.builders.components.Engine;
import example.builders.components.Transmission;

public class Manual {
    //123
    final CarType carType;
    final int seats;
    final Engine engine;
    final Transmission transmission;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String print() {

        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";

        return info;
    }
}
