package org.example.CollectionsTest;

public class Items implements Comparable<Items>{
    int id;
    String Name;
    Long Price;
    int Quantity;


    Items(int id,String name,Long price,int quantity){
        this.id=id;
        this.Name=name;
        this.Price=price;
        this.Quantity=quantity;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//here we can write the logic of comparing on the basis of whatercevr we want , writinh on price for now
    //this is bigger --->1
    //other is bigger----->-1
    //equal------------>0
    @Override
    public int compareTo(Items other) {
        if(this.Price>other.getPrice()){
            return 1;

        }
        else if(this.Price<other.getPrice()){
            return -1;
        }

        return 0;

    }
}
