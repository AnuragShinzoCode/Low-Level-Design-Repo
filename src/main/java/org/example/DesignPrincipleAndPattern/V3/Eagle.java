package org.example.DesignPrincipleAndPattern.V3;

public class Eagle extends Bird implements Flyable{
    @Override
    public void makeSound() {

    }
    //here we are doing depencdency inversion , we are not depened on direclty on call but on interface and so we need not to focus on implemenetation of it
    public void fly(FlyingBehaviour ob) {
       ob.flying();
    }

    @Override
    public void fly() {

    }
}
