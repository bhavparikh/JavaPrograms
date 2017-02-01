package com.bhavparikh;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Bank of America");
	    bank.addBranch("Little Rock");
	    bank.addCustomer("Little Rock", "Bhavya", 50.05);
	    bank.addCustomer("Little Rock", "Jatin", 200.00);
        bank.addCustomer("Little Rock", "Tarang", 150.25);

	    bank.addBranch("Conway");
	    bank.addCustomer("Conway", "Bob", 175.08);

	    bank.addCustomerTransaction("Little Rock", "Bhavya", 44.22);
	    bank.addCustomerTransaction("Little Rock", "Jatin", 32.00);
        bank.addCustomerTransaction("Little Rock", "Bhavya", 44.95);

        bank.listCustomers("Little Rock", true);

        bank.addBranch("Benton");

        if(!bank.addCustomer("Benton", "Bob", 5.53)){
            System.out.println("Error: Benton branch does not exist.");
        }

        if(!bank.addBranch("Conway")){
            System.out.println("Conway branch already exists");
        }
    }
}
