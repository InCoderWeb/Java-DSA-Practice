import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Solution { // Define a public class named 'Solution'
    public static void main(String[] args) { // Main method where program execution begins
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Enter Year: "); // Prompt the user to enter a year
        int year = scanner.nextInt(); // Read the year input as an integer and store it in variable 'year'
        scanner.close(); // Close the scanner to free up resources

        // Call the checkLeapYear method and print the result
        System.out.println(checkLeapYear(year)); // Print whether the year is a leap year using the detailed method
        // Call the checkLeapYearShorthand method and print the result
        System.out.println(checkLeapYearShorthand(year)); // Print whether the year is a leap year using the shorthand method
    }

    // Method to determine if a given year is a leap year using shorthand logic
    public static boolean checkLeapYearShorthand(int year) {
        // Return true if the year is divisible by 4 and (not divisible by 100 or divisible by 400)
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Method to determine if a given year is a leap year using detailed conditional statements
    public static boolean checkLeapYear(int year) {
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If it is divisible by 4, check if it is divisible by 100
            if (year % 100 == 0) {
                // If it is divisible by 100, check if it is also divisible by 400
                if (year % 400 == 0) {
                    return true; // Year is a leap year
                } else {
                    return false; // Year is not a leap year
                }
            }
            return true; // Year is a leap year (divisible by 4 but not 100)
        }
        return false; // Year is not a leap year (not divisible by 4)
    }
}
