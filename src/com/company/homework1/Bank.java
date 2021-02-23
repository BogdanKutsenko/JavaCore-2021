package com.company.homework1;

import java.util.Scanner;

public class Bank {
Scanner scanner = new Scanner(System.in);
    public void calculateProfit(){
        System.out.println("How much money do you have: ");
        int m = scanner.nextInt();
        System.out.println("How much percent will you chose: ");
        double n = scanner.nextInt();
        System.out.println("For how many years would you like to calculate the profit?: ");
        double k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            m += m * n / 100;
        }
        System.out.println("You'll earn " + m + " dollars.");
    }

}
