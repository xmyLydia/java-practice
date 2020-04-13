package OOP.part2;

public class Wall {
    private String wallColor;
    private double height;
    private double width;
    private String paintingMaterial;

    public Wall(String wallColor, double height, double width, String paintingMaterial) {
        this.wallColor = wallColor;
        this.height = height;
        this.width = width;
        this.paintingMaterial = paintingMaterial;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getPaintingMaterial() {
        return paintingMaterial;
    }

    public void setPaintingMaterial(String paintingMaterial) {
        this.paintingMaterial = paintingMaterial;
    }
}
