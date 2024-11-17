package Product;

public class ParkCarState implements CarState {

    @Override
    public void accelerate() {
        System.out.println("Can't accelerate. The car is parked");
    }

    @Override
    public void changeGear(Car car){
        car.setGearState(new DriveCarState());
        System.out.println("The car is now in drive state");
    }

    @Override
    public String toString() {
        return "Park state";
    }
}
