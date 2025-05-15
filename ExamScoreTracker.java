/*
 * 4b. Design a JAVA program to help a teacher track the exam scores of five students in a class. The
teacher wants to input the exam scores of each student and then view statistics such as the sum of all
scores and the highest score attained.
*/
import java.util.Scanner;

public class ExamScoreTracker {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        int[] examScores = new int[NUM_STUDENTS];

        // Input exam scores for each student
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exam scores for each student:");

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            int score = scanner.nextInt();

            // Optional: validate score to be non-negative
            while (score < 0) {
                System.out.print("Invalid score. Please enter a non-negative score for student " + (i + 1) + ": ");
                score = scanner.nextInt();
            }

            examScores[i] = score;
        }

        // Close the scanner
        scanner.close();

        // Calculate sum of scores and highest score
        int sum = 0;
        int highestScore = examScores[0];

        for (int score : examScores) {
            sum += score;
            if (score > highestScore) {
                highestScore = score;
            }
        }

        // Display statistics
        System.out.println("\nExam score statistics:");
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Highest score attained: " + highestScore);
    }
}
