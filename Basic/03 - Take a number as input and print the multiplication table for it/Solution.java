import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Solution { // Define a public class named 'Solution'
    public static void main(String[] args) { // Main method where program execution begins
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int n = sc.nextInt(); // Read the integer input from the user and store it in variable 'n'

        printTable(n); // Call the method to print the multiplication table for the number 'n'
    }

    // Method to print the multiplication table of a given number 'n'
    private static void printTable(int n) {
        // Loop from 1 to 10 to generate the multiplication table
        for (int i = 1; i <= 10; i++) {
            // Print the multiplication statement in the format "n * i = result"
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}