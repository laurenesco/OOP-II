// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 3 Problem 3.15
// Date:        01/28/2023
// Language:    Java
// Description: Exercise 3.15
//              - Remove duplicate code (Driver class)
// ------------------------------------------

public class AccountDriver {
    public static void main(String[] args) throws Exception {

        Account account1 = new Account("Jane Green", 500.00);
        Account account2 = new Account("John Blue", 200.00);
        
        account1.displayBalance();
        account2.displayBalance();

        System.out.println();

        account1.makeDeposit();

        System.out.println();

        account1.displayBalance();
        account2.displayBalance();

        System.out.println();

        account2.makeDeposit();

        System.out.println();

        account1.displayBalance();
        account2.displayBalance();

    }
}