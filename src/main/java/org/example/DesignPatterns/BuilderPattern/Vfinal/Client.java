package org.example.DesignPatterns.BuilderPattern.Vfinal;

public class Client {
    public static void main(String[] args) {
    SoldItem ob= SoldItem.getBuilder()       //get Builder metthod will retrun builder object
            .setName("hello")               //these set methods retrun Builder object only
            .setQuantity(2)
            .setId(1).
            setDis(0.2f).
            setPrime(true).
            build();                    //this method is retruing the Solditem object
        System.out.println("Object   "+ob.getName());

        //SoldItem o=new SoldItem();//now we cannot creste object like this
        //we have to use builder

        SoldItem ob1= SoldItem.getBuilder()       //get Builder metthod will retrun builder object
                .setName("hello1")               //these set methods retrun Builder object only
                .setQuantity(2)
                .setId(1).
                setDis(0.2f).
                setPrime(true).
                build();                    //this method is retruing the Solditem object
        System.out.println("Object   "+ob1.getName());

    }


    //usig this pattern the chances of getting error is less if paramaterrs are in large no also



}
