package myInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author mingyux
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        //get fields values
        List<String> values = readValues();

        //populate values to object
        musicPlayer.populateFields(values);
        //write to medium by listing all fields values
        save(musicPlayer);

        Savable player = new MusicPlayer();
        String description = ((MusicPlayer) player).toString();
        System.out.println(description);
    }

    private static void save(Savable savable) {
        List<String> fields = savable.generateFieldsList();
        if (fields != null) {
            for (String field : fields) {
                System.out.println("save " + field + " to medium");
            }
        }
    }

    private static ArrayList<String> readValues() {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("please input:");
            String value = scanner.nextLine();
            if (value == null || "end".equals(value)) {
                break;
            }
            list.add(value);
        }
        return list;
    }
}
