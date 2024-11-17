package Product;

public class ReverseCarState implements CarState {


    @Override
    public void accelerate() {
        System.out.println("Reversing");
    }


    @Override
    public void changeGear(Car car){
        car.setGearState(new ParkCarState());
        System.out.println("The car is now parked");
    }

    @Override
    public String toString() {
        return "Reverse state";
    }
}
