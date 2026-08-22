package org.example.ProducerConsumer.semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    Semaphore prodSema,conSema;

    public Consumer(Store store,Semaphore prodSema,Semaphore conSema){
        this.store=store;
        this.conSema=conSema;
        this.prodSema=prodSema;
    }

    @Override
    public void run() {
        try {
            //Aquire the lock go inside the block
            conSema.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //do the work
        store.remove();

        //increment the prodsema value here
           prodSema.release();

    }
}
