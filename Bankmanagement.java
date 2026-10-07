package assignments.miniproject;
import java.util.Scanner;

public class Bankmanagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        System.out.println("Welcome to the Bank Management System!");

        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            // Basic input validation to avoid exceptions on non-integer input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
                System.out.print("Enter your choice (1-4): ");
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited $%.2f\n", depositAmount);
                    } else {
                        System.out.println("Error: Deposit amount must be positive.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew $%.2f\n", withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient balance.");
                    } else {
                        System.out.println("Error: Withdrawal amount must be positive.");
                    }
                    break;
                case 3:
                    System.out.printf("Your current balance is: $%.2f\n", balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our bank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option from the menu.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

    

