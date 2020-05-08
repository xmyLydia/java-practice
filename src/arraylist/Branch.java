package arraylist;

import java.util.ArrayList;

/**
 * @author mingyux
 */
public class Branch {
    ArrayList<Customer> customers = new ArrayList<>();

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
