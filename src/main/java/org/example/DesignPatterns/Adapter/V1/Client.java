package org.example.DesignPatterns.Adapter.V1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();
        BankApi bankAPI = BankApiFactory.getBankAPIByName(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(100);
    }
}
