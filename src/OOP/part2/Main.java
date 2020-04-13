package OOP.part2;

public class Main {
    public static void main(String[] args) {
        Door door = new Door(1,2,"white");
        Window window = new Window(0.5,0.8, "glass");
        Wall wall = new Wall("white", 2, 4,"wall latex paint");
        Room room = new Room(door, wall, window);
        room.getWindowMaterial();
    }
}
