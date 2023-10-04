package com.driver;

import com.driver;

public class Pizza {

    private int price;
    public int basePrice;
    public int ExtraCheesePrice;
    public int ExtraToppingsPrice;
    public int paperBagPrice;

    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isTakeaway;
    private boolean isBill;

    private String bill;

    public Pizza(Boolean isVeg) {
        // your code goes here
        this.ExtraCheesePrice = 80;
        this.paperBagPrice = 20;

        if (isVeg) {
            this.basePrice = 300;
            this.ExtraToppingsPrice = 70;
        }
        else {
            this.basePrice = 400;
            this.ExtraToppingsPrice = 120;
        }

        this.price = this.basePrice;
    }

    public Pizza() {
        this(false);
    }

    public int getPrice() {
        // your code goes here
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!isExtraCheese) {
            this.price += this.ExtraCheesePrice;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isExtraToppings) {
            this.price += this.ExtraToppingsPrice;
            isExtraToppings = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!isTakeaway) {
            this.price += this.paperBagPrice;
            isTakeaway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBill) {
            this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";

            if (isExtraCheese)
                this.bill += "Extra Cheese Added: " + this.ExtraCheesePrice + "\n";

            if (isExtraToppings)
                this.bill += "Extra Toppings Added: " + this.ExtraToppingsPrice + "\n";

            if (isTakeaway)
                this.bill += "Paperbag Added: " + this.paperBagPrice + "\n";

            this.bill += "Total Price: " + this.getPrice() + "\n";

            isBill = true;
        }

        return this.bill;
    }
}