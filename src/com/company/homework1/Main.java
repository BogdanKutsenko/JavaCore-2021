package com.company.homework1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.calculateProfit();
        fillInArray1();
        printArray1();
        reversPrintArray1();
        fillInArray5_7();
        printArray5_7();

    }
    static int array1 [] = new int[5];
    public static void fillInArray1(){
        System.out.println("Enter the numbers of array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
    }
    public static void printArray1(){
        System.out.println("Your array is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }
    public static void reversPrintArray1(){
        System.out.println("Your array from end to the beginning is: ");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }
    static int array5_7 [] [] = new int[5][7];
    public static void fillInArray5_7(){
        System.out.println("The array5_7 was created.");
        for (int i = 0; i < array5_7.length; i++) {
            for (int j = 0; j < array5_7[i].length; j++) {
                array5_7 [i][j] = (int) (Math.random() * 78 - 3);
            }
        }
    }
    public static void printArray5_7(){
        System.out.println("Your array is: ");
        for (int i = 0; i < array5_7.length; i++) {
            for (int j = 0; j < array5_7[i].length; j++) {
                System.out.print(array5_7[i][j] + " ");
            }
            System.out.println();
        }
    }


}
