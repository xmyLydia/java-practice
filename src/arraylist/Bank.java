package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mingyux
 */
public class Bank {
    private static final int NONEXISTENT_BRANCH_INDEX = -1;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch branch) {
        if (!branches.contains(branch)) {
            branches.add(branch);
            System.out.println("branch added");
        } else {
            System.out.println("Branch exists");
        }
    }

    private int findBranchIndex(String branchName) {
        if (branches != null) {
            for (int i = 0; i < branches.size(); i++) {
                Branch branch = branches.get(i);
                if (branch.getBranchName() != null && branch.getBranchName().equals(branchName)) {
                    return i;
                }
            }
        }
        return NONEXISTENT_BRANCH_INDEX;
    }

    public void addCustomerToBranch(Customer customer, String branchName, double initialTransaction) {
        int indexOfBranch = findBranchIndex(branchName);
        if (indexOfBranch != NONEXISTENT_BRANCH_INDEX) {
            branches.get(indexOfBranch).addNewCustomer(customer, initialTransaction);
        } else {
            System.out.println("Branch doesn't exist");
        }
    }

    public void showCustomersOfBranch(String branchName, boolean showTransactions) {
        int indexOfBranch = findBranchIndex(branchName);
        if (indexOfBranch != NONEXISTENT_BRANCH_INDEX) {
            List<Customer> customersList = branches.get(indexOfBranch).getCustomers();
            if (customersList != null) {
                String records = branches.get(indexOfBranch).getCustomers().stream()
                        .map(Customer::getName)
                        .collect(Collectors.joining(", "));
                if (showTransactions) {
                    customersList.forEach(customer -> System.out.println(customer.getName() + "," + records));
                } else {
                    customersList.forEach(customer -> System.out.println(customer.getName()));
                }
            }

        }
    }
}
