package Lab712;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String nameBranch) {
        if (findBranch(nameBranch) == null) {
            this.branches.add(new Branch(nameBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameCustomer, String nameBranch, double initialAmount) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            return branch.newCustomer(nameCustomer, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameCustomer, String nameBranch, double amount) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            return branch.addCustomerTransaction(nameCustomer, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomer(String nameBranch, boolean showTransactions) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
