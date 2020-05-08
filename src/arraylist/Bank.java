package arraylist;

import java.util.ArrayList;

/**
 * @author mingyux
 */
public class Bank {
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
}
