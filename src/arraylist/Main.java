package arraylist;

public class Main {
    public static void main(String[] args) {

        //create customer
        Customer customer1 = new Customer("customer" );
        Customer customer2 = new Customer("customer1" );

        // create branch
        Branch branch = new Branch("branch1");
        branch.addNewCustomer(customer1, 100);
        branch.addNewCustomer(customer2, 200);
        // create bank
        Bank bank = new Bank("bank1");
        bank.addBranch(branch);

        //print out information
        bank.showCustomersOfBranch("branch1", false);
    }
}
