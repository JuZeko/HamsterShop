package org.acme.getting.started;

public class Products {

    public String name,image;
    public int price,amount;


    public Products() {
    }

    public Products(String name,int price,String image, int amount) {

        this.name = name;
        this.image = image;
        this.price = price;
        this.amount = amount;
    }
    
}