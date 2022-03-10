package example.builders.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean stated;

    public Engine(double volume, double mileage) {
        this.volume = volume;//1
        this.mileage = mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void on () {
        stated = true;
    }

    public void off(){
        stated = false;
    }

    public boolean isStated(){
        return stated;
    }
    public void go(double mileage){
        if (stated) {
           this.mileage =+ mileage;
        } else {
            System.out.println("Cannot go(), you must start engine first!");
        }

    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
