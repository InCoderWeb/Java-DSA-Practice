import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        int ans = 0; // Variable to store the sum of the integers

        // Infinite loop to keep reading input until "x" is entered
        while (true) {
            String inp = in.nextLine(); // Read the entire line of input

            // Check if the input is "x" to exit the loop
            if (inp.equals("x")) {
                break; // Exit the loop
            }

            try {
                // Try to parse the input to an integer
                int n = Integer.parseInt(inp);
                ans += n; // Add the parsed integer to the sum
            } catch (NumberFormatException e) {
                // Handle the case where the input is not a valid integer
                System.out.println("Please enter a valid integer or 'x' to exit.");
            }
        }

        // Print the total sum of the entered integers
        System.out.println(ans);
        in.close(); // Close the scanner
    }
}