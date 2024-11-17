package Product;

public class DriveCarState implements CarState {

    @Override
    public void accelerate(){
        System.out.println("Accelerate");
    }

    @Override
    public void changeGear(Car car){
        car.setGearState(new ReverseCarState());
        System.out.println("Change Gear to reverse");
    }



    @Override
    public String toString() {
        return "Drive state";
    }
}
