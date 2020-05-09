package arraylist;

import java.util.ArrayList;

/**
 * @author mingyux
 */
public class Branch {
    private String branchName;
    ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addNewCustomer(Customer customer, double initialTransaction) {
        if (!customers.contains(customer)) {
            addInitialTransactionAmount(customer, initialTransaction);
            customers.add(customer);
            System.out.println("customer added");
        } else {
            System.out.println("already exists.");
        }

    }

    private void addInitialTransactionAmount(Customer customer, double amount) {
        customer.getRecords().add(amount);
    }

    public void addAdditionalTransaction(Customer customer, double additionalTransaction) {
        if (customers.contains(customer)) {
            ArrayList<Double> records =
                    customers.get(customers.indexOf(customer)).getRecords();
            if (records != null) {
                records.add(additionalTransaction);
            }
        } else {
            System.out.println("can't find this customer");
        }
    }
}
