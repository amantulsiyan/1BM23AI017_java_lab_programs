/*
 * Develop a text processing tool for a language learning platform. The tool needs to compare strings,
concatenate strings, and create copies of strings for various languages. Implement appropriate Java
functionalities.
*/

public class String_Functions {

    // Function to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Case-sensitive comparison
    }

    // Function to copy a string
    public static String copyString(String original) {
        return new String(original); // Creates a new String object with the same content
    }

    // Function to concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Test compareStrings function
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("String Comparison:");
        System.out.println("Are the strings equal? " + compareStrings(str1, str2));

        // Test copyString function
        String original = "Copy me!";
        String copied = copyString(original);
        System.out.println("\nString Copy:");
        System.out.println("Original string: " + original);
        System.out.println("Copied string: " + copied);

        // Test concatenateStrings function
        String part1 = "Hello, ";
        String part2 = "world!";
        String concatenated = concatenateStrings(part1, part2);
        System.out.println("\nString Concatenation:");
        System.out.println("Concatenated string: " + concatenated);
    }
}

