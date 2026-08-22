package org.example.CollectionsTest;

public class Electronics extends Items{
int warranty;



    Electronics(int id, String name, Long price, int quantity,int warranty) {
        super(id, name, price, quantity);
        this.warranty=warranty;

    }
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
