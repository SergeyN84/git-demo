package example.builders.director;

import example.builders.builders.Builder;
import example.builders.cars.CarType;
import example.builders.components.Engine;
import example.builders.components.Transmission;

public class Director {
    public void constructSportsCar(Builder bilder) {
        bilder.setCarType(CarType.SPORTS_CAR);
        bilder.setEngine(new Engine(4.0, 10));// changes 120322
        bilder.setSeats(2);
        bilder.setTransmission(Transmission.MANUAL);
    }

    public void constructCityCar(Builder bilder) {
        bilder.setCarType(CarType.CITY_CAR);
        bilder.setEngine(new Engine(1.6, 50));
        bilder.setSeats(4);
        bilder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructBus(Builder bilder) {
        bilder.setCarType(CarType.CITY_CAR);
        bilder.setEngine(new Engine(10.0, 150));
        bilder.setSeats(40);
        bilder.setTransmission(Transmission.MANUAL);
    }
}
