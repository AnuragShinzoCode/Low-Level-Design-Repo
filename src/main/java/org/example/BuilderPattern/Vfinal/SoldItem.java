package org.example.BuilderPattern.Vfinal;

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

    private SoldItem(SoldItemBuilder soldItemBuilder){
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

    public static class SoldItemBuilder {

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
}

