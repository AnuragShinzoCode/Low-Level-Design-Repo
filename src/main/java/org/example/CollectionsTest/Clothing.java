package org.example.CollectionsTest;

public class Clothing extends Items{
    String size;

    Clothing(int id, String name, Long price, int quantity,String size) {
        super(id, name, price, quantity);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
