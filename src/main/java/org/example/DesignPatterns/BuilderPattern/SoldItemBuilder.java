package org.example.DesignPatterns.BuilderPattern;

public class SoldItemBuilder {

    int id;
    String name;
    int price;
    public SoldItem build(){
        return new SoldItem(this);
    }
    public int getId() {
        return id;
    }

    public SoldItemBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SoldItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public SoldItemBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Float getDis() {
        return dis;
    }

    public SoldItemBuilder setDis(Float dis) {
        this.dis = dis;
        return this;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public SoldItemBuilder setPrime(boolean prime) {
        isPrime = prime;
        return this;
    }

    int quantity;
    Float dis;
    boolean isPrime;
}
