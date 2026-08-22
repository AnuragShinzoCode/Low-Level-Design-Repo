package org.example.ProducerConsumer.semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    Semaphore prodSema,conSema;

    public Producer(Store store,Semaphore prodSema,Semaphore conSema){
        this.store=store;
        this.conSema=conSema;
        this.prodSema=prodSema;
    }

    @Override
    public void run() {
        while(true){
//acqire the lock here
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // do the work
            store.add(new Object());
//increase the value of consema now
            conSema.release();

        }
    }
}
