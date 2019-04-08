package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        Boolean toggle = true;

        Fiction book1 = new Fiction("War and Peace",12.99);
        Fiction book2 = new Fiction("Moby Dick", 18.42);
        Fiction book3 = new Fiction("Catcher in the Rye", 7.42);
        Fiction book4 = new Fiction("1984", 5.32);
        Fiction book5 = new Fiction("Animal Farm", 10.89);

        NonFiction book6 = new NonFiction("Effective Java", 26.92);
        NonFiction book7 = new NonFiction("Thinking in Java", 22.42);
        NonFiction book8 = new NonFiction("Java for Dummies", 17.99);
        NonFiction book9 = new NonFiction("How to Program", 14.35);
        NonFiction book10 = new NonFiction("Core Java", 7.28);

        Book[] bookArr = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};


        System.out.println("Welcome to the Book Application...");

        while(toggle){

            System.out.println("\nHere are the options...\n");
            System.out.print("Press 1 to see all books in the list \n" +
                            "Press 2 to see all Fiction titles \n" +
                            "Press 3 to see all NonFiction titles \n" +
                            "Press 4 to Open the Shopping Cart \n" +
                            "Press 0 to exit\n");

            int selection = myScan.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Here are all the books in the List");
                    printList(bookArr);
                    break;

                case 2:
                    System.out.println("Here are all Fiction titles \n");
                    printList(Arrays.copyOfRange(bookArr,0,5));
                    break;

                case 3:
                    System.out.println("Here are all NonFiction titles \n");
                    printList(Arrays.copyOfRange(bookArr,5,10));
                    break;

                case 4:
                    shoppingCart(bookArr);
                    break;


                case 0:
                    System.out.print("Exiting...\n");
                    System.out.print("Goodbye!\n");
                    toggle = false;
                    myScan.close();
                    break;
            }


        }

    }

    public static void printList(Book[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.println((i + 1) + ":" + arr[i].toString());
        }

    }

    public static void shoppingCart(Book[] arr){
        Scanner shopScan = new Scanner(System.in);
        Double runningTotal = 00.00;
        int cart = 0;

        System.out.println("Select the number corresponding to the desired Book Title");
        System.out.println("Press 0 to exit \n");

        while(true){

            printList(arr);
            int lastSelection = shopScan.nextInt();
            System.out.println();

            if(lastSelection == 0){
                //shopScan.close();
                System.out.println("Exiting Shopping Cart...");
                break;
            }

            runningTotal += arr[lastSelection - 1].getPrice();
            cart += 1;

            System.out.println("\n You have " + cart + " items in your cart!");
            System.out.printf("Your total is " + "$" + "%.2f \n", runningTotal );
            System.out.println();



        }


    }
}
