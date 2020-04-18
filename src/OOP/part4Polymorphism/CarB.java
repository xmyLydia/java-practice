package OOP.part4Polymorphism;

public class CarB extends Car {
    public CarB(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Car B's style of accelerate");
    }
}
