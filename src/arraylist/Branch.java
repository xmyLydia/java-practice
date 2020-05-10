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

    public void addNewCustomer(String customerName, double initialTransaction) {
        Customer customer = new Customer(customerName);
        customers.add(customer);
        addInitialTransactionAmount(customerName, initialTransaction);
        System.out.println("customer added");
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName() != null && customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    private void addInitialTransactionAmount(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.getRecords().add(amount);
        } else {
            System.out.println("unable to find customer");
        }
    }

    public void addAdditionalTransaction(String customerName, double additionalTransaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
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
