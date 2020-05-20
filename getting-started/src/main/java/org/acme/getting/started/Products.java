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








// SETERS & GETERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    


    
}