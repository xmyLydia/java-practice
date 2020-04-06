package OOP.part1.inheritance;

public class Car extends Vehicle {
    private int wheels;
    private String carLabel;

    public Car(String name, double speed, int gear, String material) {
        super(name, speed, gear, material);
    }

    public Car(String name, double speed, int gear, String material, int wheels, String carLabel) {
        super(name, speed, gear, material);
        this.wheels = wheels;
        this.carLabel = carLabel;
    }

    public Car(int wheels, String carLabel){
        super();
        this.wheels = wheels;
        this.carLabel = carLabel;
    }
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getCarLabel() {
        return carLabel;
    }

    public void setCarLabel(String carLabel) {
        this.carLabel = carLabel;
    }

    @Override
    public void setGear(int speed) {
       if(speed<10){
           super.setGear(1);
       }else{
           super.setGear(2);
       }
    }
}
