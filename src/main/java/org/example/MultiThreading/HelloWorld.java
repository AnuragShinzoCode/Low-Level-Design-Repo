package org.example.MultiThreading;

public class HelloWorld implements Runnable{
int i=0;
final int MAX=100;
    void print(){
        System.out.println("printing i walue"+i+"with thread"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
//    HelloWorld(int i){
//        this.i=i;
//    }
    public synchronized void printodd() throws InterruptedException {
        while(i<=MAX){

            while (i%2==0){
                wait();
            }
            if(i<=MAX){
               // System.out.println(i+":"+Thread.currentThread().getName());
                i++;
                notify();
            }
        }
    }

    public synchronized void printeven() throws InterruptedException {
        while(i<=MAX){

            while (i%2==1){
                wait();
            }
            if(i<=MAX){
                System.out.println(i+":"+Thread.currentThread().getName());
                i++;
                notify();
            }
        }
    }

}
