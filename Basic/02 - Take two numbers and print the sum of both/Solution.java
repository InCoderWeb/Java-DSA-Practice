import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Solution { // Define a public class named 'Solution'
    public static void main(String[] args) { // Main method where program execution begins
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.println("Enter First Number:"); // Prompt the user to enter the first number
        int a = scanner.nextInt(); // Read the first number input as an integer and store it in variable 'a'
        
        System.out.println("Enter Second Number:"); // Prompt the user to enter the second number
        int b = scanner.nextInt(); // Read the second number input as an integer and store it in variable 'b'

        System.out.println(a + b); // Calculate the sum of 'a' and 'b' and print the result to the console
    }    
}
