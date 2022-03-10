package example.builders.builders;

import example.builders.cars.Car;
import example.builders.cars.CarType;
import example.builders.components.Engine;
import example.builders.components.Transmission;

public class CarBuilder implements Builder {

    private CarType type;
    int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResult(){
        return new Car(type, seats, engine, transmission);
    }
}
