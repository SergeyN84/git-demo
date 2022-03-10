package example.builders.builders;

import example.builders.cars.CarType;
import example.builders.components.Engine;
import example.builders.components.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}
