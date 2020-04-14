package OOP.part2;

public class Window {
    private double width;
    private double height;
    private Glass glass;

    public Window(double width, double height, Glass glass ) {
        this.width = width;
        this.height = height;
        this.glass = glass;
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

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public void printWindowMaterialForRoom() {
        System.out.println("window material: " + glass.getMaterial());
    }
}
