package Product;

public class Car  {

    private CarState carState;

    public Car() {
        this.carState = new ParkCarState();
    }

    public Car(CarState carState) {
        this.carState = carState;
    }

    public CarState getGearState() {
        return carState;
    }


    public void accelerate() {
        this.carState.accelerate();
    }

    public void changeGear(){
        carState.changeGear(this);
    }

    public void setGearState(CarState carState) {
        this.carState = carState;
    }


    @Override
    public String toString() {
        return "Current carState " + carState;
    }
}
