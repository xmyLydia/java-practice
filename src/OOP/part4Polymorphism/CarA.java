package OOP.part4Polymorphism;

public class CarA extends Car {
    private String nameOfCarA;
    public CarA(int cylinder, String name) {
        super(cylinder, name);
    }

    public CarA(int cylinder, String name, String nameOfCarA) {
        super(cylinder, name);
        this.nameOfCarA = nameOfCarA;
    }

    @Override
    public String getName() {
        return this.nameOfCarA;
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Car A's style of accelerate");
    }
}
