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

        Computer computer = new Computer();
        save(computer);
        System.out.println(computer.toString());
    }

    private static void save(Computer computer) {

        ArrayList<String> fields = readValues();
        computer.populateFields(fields);
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
