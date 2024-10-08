import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner sc = new Scanner(System.in);

    // Read two integers from the user
    System.out.println("Enter First Number:");
    int a = sc.nextInt(); // First number

    System.out.println("Enter Second Number:");
    int b = sc.nextInt(); // Second number

    // Call the findHCF method and print the result
    System.out.println(findHCF(a, b));
  }

  // Method to find HCF using the Euclidean algorithm
  public static int findHCF(int a, int b) {
    // Continue looping until b becomes 0
    while (b != 0) {
      int temp = b; // Store b in a temporary variable
      b = a % b; // Update b to the remainder of a divided by b
      a = temp; // Update a to the previous value of b
    }
    return a; // When b is 0, return a as the HCF
  }

  // Method to find HCF using recursion
  private static int findHCFUsingRecursion(int a, int b) {
    // Base case: if b is 0, return a as the HCF
    if (b == 0) {
      return a; // HCF found
    }

    // Recursive call: store the value of b in a temporary variable
    int tmp = b; // Store b in tmp
    b = a % b; // Update b to the remainder of "a" divided by "b"
    a = tmp; // Update "a" to the previous value of "b"

    // Call the findHCF method again with updated values of a and b
    return findHCF(a, b);
  }
}
