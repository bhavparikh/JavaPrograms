package com.bhavparikh;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(findCustomer(customerName) != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name){
        for(int i = 0; i <this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }

        return null;
    }
}
