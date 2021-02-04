// CSIT111 or HCSI 111 or CSIT811 Assignment 1
// Mark: 10 / 10

import java.util.Scanner;
import java.io.*; 
import java.nio.file.Paths;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws IOException {
        
        String fileName = args[0];

        // Reads PIN and account balance on startup
        Scanner read = new Scanner(Paths.get(fileName));
        long pin = Long.parseLong(read.nextLine());
        double bal = Double.parseDouble(read.nextLine());
        read.close();

        // Asks user to enter PIN and compares against stored PIN
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your PIN:");
        long hashedAttempt = (long)((Long.parseLong(input.nextLine()) * 2654435761L)%(Math.pow(2, 32)));

        while (hashedAttempt != pin) {
            System.out.print("Please enter your correct PIN:");
            hashedAttempt = (long)((Long.parseLong(input.nextLine()) * 2654435761L)%(Math.pow(2, 32)));
        }

        int userSelection = -1;

        // Main ATM loop
        while (userSelection != 0) {

            System.out.println();
            System.out.println("1 - Inquire Balance");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Deposit");
            System.out.println("0 - Quit");

            // System.out.print("");
            userSelection = Integer.parseInt(input.nextLine());

            switch (userSelection) {

                case 1:
                    // Inquire Balance
                    System.out.printf("The current balance is %.2f%n", bal);
                    userSelection = -1;
                    break;

                case 2:
                    // Withdraw
                    System.out.print("Enter the amount to withdraw:");
                    double withdrawAmount = Double.parseDouble(input.nextLine());

                    if (withdrawAmount > bal) {
                        System.out.println("Insufficient balance.");

                    } else {
                        bal -= withdrawAmount;
                        System.out.printf("The current balance is %.2f%n", bal);
                    }

                    userSelection = -1;
                    break;

                case 3:
                    // Deposit
                    System.out.print("Enter the amount to deposit:");
                    double depositAmount = Double.parseDouble(input.nextLine());

                    if (depositAmount < 0) {
                        System.out.println("Enter value greater than 0.");
                    } else {
                        bal += depositAmount;
                        System.out.printf("The current balance is %.2f%n", bal);
                    }

                    userSelection = -1;
                    break;

                default:
                    if (userSelection != 0) {
                       System.out.println("Enter 1 or 2 or 3 or 0."); 
                    } 
            }
        }
        input.close();
    }
}