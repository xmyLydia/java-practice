package OOP.part1.inheritance;

public class Lamborghini extends Car {
    private String newFeature;

    public Lamborghini(String name, double speed, int gear, String material) {
        super(name, speed, gear, material);
    }

    public String getNewFeature() {
        return newFeature;
    }

    public void setNewFeature(String newFeature) {
        this.newFeature = newFeature;
    }
}
