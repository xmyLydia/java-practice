package OOP.part2;

public class Window {
    private double width;
    private double height;
    private String material;

    public Window(double width, double height, String material) {
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void printWindowMaterialForRoom() {
        System.out.println("window material: " + getMaterial());
    }
}
