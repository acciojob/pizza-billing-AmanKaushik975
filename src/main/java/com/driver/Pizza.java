package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        this.price = (isVeg) ? 300 : 400;
        this.bill = "Base Price Of The Pizza: " + price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!bill.contains("Extra Cheese Added")) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!bill.contains("Extra Toppings Added")) {
            int toppingsPrice = (isVeg) ? 70 : 120;
            this.price += toppingsPrice;
            this.bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!bill.contains("Extra Toppings Added")) {
            int toppingsPrice = (isVeg) ? 70 : 120;
            this.price += toppingsPrice;
            this.bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill + "Total Price: " + this.price;
    }
}