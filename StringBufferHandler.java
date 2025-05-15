/*
3b. Write a program in Java for String handling which performs the following:
i. Checks the capacity of String Buffer objects.
ii. Reverses the contents of string given on console and converts the resultant string in upper
case.
iii. Reads a string from console and appends it to the resultant string.
*/

import java.util.Scanner;

public class StringBufferHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task i: Checking capacity of StringBuffer objects
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of StringBuffer object sb1: " + sb1.capacity()); // Default = 16
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object sb2: " + sb2.capacity()); // 16 + length of "Hello" = 21

        // Task ii: Reversing the contents of a string and converting to uppercase
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        StringBuffer reversedBuffer = new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase: " + reversedUpperCase);

        // Task iii: Reading a string from console and appending it
        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending: " + reversedBuffer);

        scanner.close();
    }
}
