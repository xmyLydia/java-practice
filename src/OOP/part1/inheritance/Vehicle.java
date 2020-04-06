package OOP.part1.inheritance;

public class Vehicle {
    private String name;
    private double speed;
    private int gear;
    private String material;

    public Vehicle() {
        name = "name";
        speed = 1;
        gear = 4;
        material = "material";
    }

    public Vehicle(String name, double speed, int gear, String material) {
        this.name = name;
        this.speed = speed;
        this.gear = gear;
        this.material = material;
    }

    public int getGear() {
        return gear;
    }

    public void increaseSpeed(double add) {
        speed += add;
    }

    public void decreaseSpeed(double decrease) {
        if (speed >= decrease) {
            speed = speed - decrease;
        } else {
            speed = 0;
        }
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void steering() {
        System.out.println("vehicle steering");
    }

    public void moving() {
        System.out.println("move in 20 km/h");
    }
}
