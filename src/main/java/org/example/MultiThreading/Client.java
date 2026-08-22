package org.example.MultiThreading;

public class Client {

    public static void main(String args[]){

        System.out.println("inside mail"+Thread.currentThread().getName());
        HelloWorld ob=new HelloWorld();

        //Thread t=new Thread(ob);
        //ob.run();
        //this internally calls the run method
       // t.start();
        System.out.println("after creating thread mail"+Thread.currentThread().getName());
//
//        for(int i=1;i<=100;i++){
//            HelloWorld ob1=new HelloWorld(i);
//            Thread t1=new Thread(ob1);
//            t1.start();
//        }

        Thread odd=new Thread(() -> {
            try{
                ob.printodd();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        },"odd Thread");
        Thread even=new Thread(() -> {
        try{
            ob.printeven();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        },"enen thread");

        odd.start();
        even.start();

    }
}
