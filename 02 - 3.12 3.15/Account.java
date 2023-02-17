import java.util.Scanner;

// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 3 Problem 3.15
// Date:        01/28/2023
// Language:    Java
// Description: Exercise 3.15
//              - Remove duplicate code
// ------------------------------------------

public class Account {
    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) { this.balance = balance; }
    }

    // Set methods
    public void setName(String name) { this.name = name; }
    public void deposit(double amount) {
        if (amount > 0.0) { this.balance = this.balance + amount; }
    }
    public void makeDeposit() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter deposit amount for %s: ", name);
        double amount = input.nextDouble();
        System.out.printf("Adding %.2f to %s's account.\n", amount, name);
        this.deposit(amount);
    }

    // Get methods
    public String getName() { return this.name; }
    public double getBalance() { return balance; }
    public void displayBalance() {
        String result = String.format("%s's balance: $%.2f",
                          name, balance);
        System.out.println(result);
    }
}