package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean cheese;
    protected boolean topping;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price=300;
            this.bill="Base Price Of The Pizza: 300";
        }
        else{
            this.bill="Base Price Of The Pizza: 400";
            this.price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.cheese==false) {
            this.cheese=true;
            this.bill+="\n"+"Extra Cheese Added: 80";
                this.price+=80;

        }

    }

    public void addExtraToppings(){
        if(this.topping==false){
            this.topping=true;
            if(isVeg){
                this.bill+="\n"+"Extra Toppings Added: 70";
                this.price+=70;
            }
            else{
                this.bill+="\n"+"Extra Toppings Added: 120";
                this.price+=120;
            }
        }
    }

    public void addTakeaway(){
        this.bill+="\n"+"Paperbag Added: 20";
        this.price+=20;
    }

    public String getBill(){
        // your code goes here
        this.bill+="\n"+"Total Price: "+this.price;
        return this.bill;
    }
}
