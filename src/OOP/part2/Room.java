package OOP.part2;

public class Room {
    private Door door;
    private Wall wall;
    private Window window;

    public Room(Door door, Wall wall, Window window) {
        this.door = door;
        this.wall = wall;
        this.window = window;
    }

    public void getWindowMaterial() {
        window.printWindowMaterialForRoom();
    }
}
