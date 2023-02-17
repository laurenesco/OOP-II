// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 3 Problem 3.12
// Date:        01/14/2023
// Language:    Java
// Description: Exercise 3.12
//              - Invoice Driver Class
// ------------------------------------------

public class InvoiceTest {
    public static void main(String[] args) throws Exception {

        // Adding newline for format in terminal
        System.out.println("\n");

        // Instantiate an invoice
        Invoice invoice1 = new Invoice("5642A8E", "Power Washer", 
                                       7, 542);

        // Print intital configuration
        String total = String.format("%.2f", invoice1.getInvoiceAmount());
        String output = "The invoice is for a " + invoice1.getItemDesc() +
                 " with part number " + invoice1.getItemNumber() +
                 " and price $" + invoice1.getItemPrice() +
                 " with a total of " + invoice1.getItemQuantity() + " in the order.\n" +
                 " The total price is $" + total + "\n\n";
        System.out.println(output);

        // Alter the instance variables
        invoice1.setItemNumber("68464C");
        invoice1.setItemDesc("Toothbrush");
        invoice1.setItemPrice(5);
        invoice1.setItemQuantity(2);

        // Print updated configuration
        total = String.format("%.2f", invoice1.getInvoiceAmount());
        output = "The invoice is for a " + invoice1.getItemDesc() +
        " with part number " + invoice1.getItemNumber() +
        " and price $" + invoice1.getItemPrice() +
        " with a total of " + invoice1.getItemQuantity() + " in the order.\n" +
        " The total price is $" + total + "\n\n";
        System.out.println(output);
    }
}