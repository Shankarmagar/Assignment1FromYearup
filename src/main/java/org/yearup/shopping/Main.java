package org.yearup.shopping;

public class Main {

    public static void main(String[] args){

        System.out.println(
                "Hello Human here is your list");

        int numberOfItems = 5;

        printItemCount(numberOfItems);


        System.out.println(
                "Enjoy your list!");


    }

    public static void printItemCount(int n){
        //   int numberOfItems = 5;

        System.out.println(
                "You have " + n + " items");

    }


}
