package arraylist;

import java.util.ArrayList;

/**
 * @author mingyux
 */
public class Customer {
    private String name;
    ArrayList<Double> records = new ArrayList<>();

    public Customer(String name, ArrayList<Double> records) {
        this.name = name;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Double> records) {
        this.records = records;
    }
}
