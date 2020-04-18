package OOP.part4Polymorphism;

public class Car {
    private static int defaultWheel = 4;
    private boolean engine;
    private int cylinder;
    private int wheel;
    private double speed;
    private String name;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheel = defaultWheel;
        this.engine = true;
    }

    public static int getDefaultWheel() {
        return defaultWheel;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheel() {
        return wheel;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        this.engine = true;
    }

    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println("Base car: " + speed);
    }

    public void brake() {
        this.speed = 0;
        this.engine = false;
    }
}
