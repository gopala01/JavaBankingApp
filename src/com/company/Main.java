package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account acc1 = new Account();

        int choice = inputInt("""
               What would you like to do?
               1. Display amount
               2. Deposit money
               3. Withdraw money
               4. Exit
                """);

        while (choice != 4) {

            if (choice > 4 || choice < 1) {System.out.println("Invalid choice, try again");}
            else if (choice == 1) {
                System.out.println("£" + acc1.displayAmount());
            } else if (choice == 2) {
                int amount = inputInt("How much would you like to deposit?");
                acc1.deposit(amount);
            } else if (choice == 3) {
                int amount = inputInt("How much would you like to withdraw?");
                acc1.withdraw(amount);
            }
            choice = inputInt("""
                What would you like to do? 
                1. Display amount
                2. Deposit money
                3. Withdraw money
                4. Exit """);
        } //Keeps looping until user presses 4 to exit


    }

    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println(message);
        answer = scanner.nextLine();

        return answer;
    } //returns a string input

    public static int inputInt(String message)
    {
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println(message);
        answer = scanner.nextInt();

        return answer;
    } //returns an integer input

}

