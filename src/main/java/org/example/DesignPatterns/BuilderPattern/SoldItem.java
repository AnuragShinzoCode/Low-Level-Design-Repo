package org.example.DesignPatterns.BuilderPattern;

public class SoldItem {
    int id;
    String name;
    int price;
    int quantity;
    Float dis;
    boolean isPrime;

    static SoldItemBuilder getBuilder(){
        return new SoldItemBuilder();
    }

    public SoldItem(SoldItemBuilder soldItemBuilder){
        this.id=soldItemBuilder.getId();
        this.name=soldItemBuilder.getName();
        this.dis=soldItemBuilder.getDis();
        this.quantity=soldItemBuilder.getQuantity();
        this.isPrime=soldItemBuilder.isPrime();
        this.price=soldItemBuilder.getPrice();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDis(Float dis) {
        this.dis = dis;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Float getDis() {
        return dis;
    }

    public boolean isPrime() {
        return isPrime;
    }
}

