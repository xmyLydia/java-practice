package arraylist;

public class Main {
    public static void main(String[] args) {

        //create customer
        String customerName1 = "customer1";
        String customerName2 = "customer2";

        // create branch
        Branch branch = new Branch("branch1");
        branch.addNewCustomer(customerName1, 100);
        branch.addNewCustomer(customerName2, 200);
        // create bank
        Bank bank = new Bank("bank1");
        bank.addBranch(branch);
        bank.addCustomerToBranch("customer3", "branch1", 300);

        //print out information
        bank.showCustomersOfBranch("branch1", true);

        branch.addAdditionalTransaction("customer1", 300);
        bank.showCustomersOfBranch("branch1", true);
    }
}
