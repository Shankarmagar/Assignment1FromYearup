package org.yearup.shopping;

public class Main {

    public static void main(String[] args){

        System.out.println(
                "Hello Human here is your list");

        int numberOfItems = 5;

        printItemCount(numberOfItems);


        System.out.println(
                "Enjoy your list!");


        Receipt receipt = new Receipt("Paul", 25);
        printReceipt(receipt);
    }

    public static void printReceipt(Receipt r){

        System.out.println(
                "Thank you " + r.name() + " you owe " + r.amount()
        );
    }

    public static void printItemCount(int n){

        System.out.println(
                "You have " + n + " items");

    }


}
