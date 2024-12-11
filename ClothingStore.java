package com.example.csc210gui;
/*
Aaron Ayuso
Sunia Lissa
CSC 210 0900
Creating a clothing store page with JavaFx
12/2/24
Project Version: 5
 */
public class ClothingStore {
    private String[][] login = {{"Username", "Macy"}, {"Password", "1 Herald Square"}};
    private String[] Itemname = {"Sweater", "Jeans", "Coat", "Jordans", "Watch"};
    private double[] ItemPrice = {19.99, 21.99, 34.99, 29.99, 44.99};
    private double tax = 0.08;

    //Method to get username
    public String getusername() {
        return login[0][1];
    }

    //Method to get password
    public String getpassword() {
        return login[1][1];
    }

    // Method to get all item names
    public String[] getItemNames() {
        return Itemname; // Return the array of item names
    }

    //Method to get itemPrice
    public double getItemPrice(String itemName) {
        for (int i = 0; i < Itemname.length; i++) {
            if (Itemname[i].equalsIgnoreCase(itemName)) {

                return ItemPrice[i];
            }
        }
        return -1;
    }

    // Method to calculate the total cost
    public double calculateCost(String itemName, int quantity) {
        double price = getItemPrice(itemName);
        if (price == -1) {
            System.out.println("Item not found.");
            return 0;
        }
        return price * quantity;
    }

    // Method to Calculate the tax based on the pre-cost
    public double calculateTaxes(double preCost) {
        return preCost * tax; // Calculate tax (preCost * tax rate)
    }

    // Calculate the total cost including tax
    public double totalCost(double preCost) {
        double taxAmount = calculateTaxes(preCost); // Calculate tax
        return preCost + taxAmount; // Return total cost (preCost + tax)
    }
}

