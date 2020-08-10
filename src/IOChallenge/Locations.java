package IOChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author timbuchalka
 * @date 2/04/2016
 */
public class Locations implements Map<Integer, Location> {
    private static final Map<Integer, Location> LOCATIONS = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        try (FileWriter locFile = new FileWriter("locations.txt");
             FileWriter dirFile = new FileWriter("directions.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(locFile);
             BufferedWriter dirBufferedWriter = new BufferedWriter(dirFile)) {

            for (Location location : LOCATIONS.values()) {
                bufferedWriter.write(location.getLocationID() + "," + (location.getDescription()) + ("\n"));

                for (String direction : location.getExits().keySet()) {
                    if (!"Q".equalsIgnoreCase(direction)) {
                        dirBufferedWriter.write((location.getLocationID()) + "," + (direction) + ","
                                + (location.getExits().get(direction)) + ("\n"));
                    }
                }
            }
        }
    }

    static {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("locations_big.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] arr = line.split(",");
                if (arr.length > 1) {
                    int loc = Integer.parseInt(arr[0]);
                    String description = arr[1];
                    System.out.println("Imported loc: " + loc + ": " + description);
                    Map<String, Integer> tempExit = new HashMap<>();
                    LOCATIONS.put(loc, new Location(loc, description, tempExit));
                }
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Now read the exits
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = LOCATIONS.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return LOCATIONS.size();
    }

    @Override
    public boolean isEmpty() {
        return LOCATIONS.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return LOCATIONS.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return LOCATIONS.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return LOCATIONS.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return LOCATIONS.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return LOCATIONS.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        LOCATIONS.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return LOCATIONS.keySet();
    }

    @Override
    public Collection<Location> values() {
        return LOCATIONS.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return LOCATIONS.entrySet();
    }
}
