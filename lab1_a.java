/*
 1a. Design a membership management system for a fitness center, where the system
should allow gym administrators to store information about gym members- name, age,
membership status(true/false), and membership duration (in months). Calculate the
membership fee based on the membership duration using a predefined fee. Display
detailed information of the member.
*/
import java.util.Scanner;

public class lab1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter member information
        System.out.println("Welcome to the Gym Membership Management System!");

        System.out.print("Enter member name: ");
        String name = scanner.nextLine();

        System.out.print("Enter member age: ");
        int age = scanner.nextInt();

        System.out.print("Is the membership active? (true/false): ");
        boolean isActive = scanner.nextBoolean();

        System.out.print("Enter membership duration (in months): ");
        int duration = scanner.nextInt();

        // Calculate membership fee (assuming $50 per month)
        double membershipFee = duration * 50.0;

        // Display member details
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Membership Duration: " + duration + " months");
        System.out.println("Membership Fee: $" + membershipFee);

        scanner.close();
    }
}

