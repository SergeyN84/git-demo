package example.builders.builders;

import example.builders.cars.CarType;
import example.builders.cars.Manual;
import example.builders.components.Engine;
import example.builders.components.Transmission;

public class CarManualBuilder implements Builder {

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

    public Manual getResult(){
        return new Manual(type, seats, engine, transmission);
    }
}
