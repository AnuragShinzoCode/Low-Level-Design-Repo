package org.example.DesignPatterns.Adapter.V0;

public class Client {

    public static void main(String[] args) {
        //1
        PhonePe phonePe = new PhonePe();
        //now i  hva to change from phone pe to icici then we have me to make multiple changes
        phonePe.rechargeFastTag(100);
    }
}
