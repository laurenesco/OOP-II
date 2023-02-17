// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 3 Problem 3.12
// Date:        01/28/2023
// Language:    Java
// Description: Exercise 3.12
//              - Invoice Class
// ------------------------------------------

public class Invoice {
    private String itemNumber;
    private String itemDesc;
    private int itemQuantity;
    private int itemPrice;

    // Constructors
    public Invoice() {}
    public Invoice(String number, String desc,
                   int quantity, int price) {
        itemNumber = number;
        if (quantity >= 0) { itemQuantity = quantity; }
        if (price >= 0) { itemPrice = price; }
        itemDesc = desc;
    }

    // Get methods
    public double getInvoiceAmount() { return itemQuantity * itemPrice; }
    public String getItemNumber() { return itemNumber; }
    public String getItemDesc() { return itemDesc; }
    public int getItemQuantity() { return itemQuantity; }
    public int getItemPrice() { return itemPrice; }

    // Set methods
    public void setItemNumber(String number) { itemNumber = number; }
    public void setItemDesc(String desc) { itemDesc = desc; }
    public void setItemQuantity(int quantity) { itemQuantity = quantity; }
    public void setItemPrice(int price) { itemPrice = price; }
}