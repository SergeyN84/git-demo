package example.builders.director;

import example.builders.builders.Builder;
import example.builders.cars.CarType;
import example.builders.components.Engine;
import example.builders.components.Transmission;

public class Director {
    public void constructSportsCar(Builder bilder) {
        bilder.setCarType(CarType.SPORTS_CAR);
        bilder.setEngine(new Engine(7.0, 10));
        bilder.setSeats(2);
        bilder.setTransmission(Transmission.MANUAL);
    }

    public void constructCityCar(Builder bilder) {
        bilder.setCarType(CarType.CITY_CAR);
        bilder.setEngine(new Engine(1.6, 50));
        bilder.setSeats(4);
        bilder.setTransmission(Transmission.AUTOMATIC);
    }
}
