import java.util.Scanner;

public class Solution {
    private static double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double radius = sc.nextDouble();

        double area = PI * (radius * radius);
        System.out.printf("Area of circle is: %.2f", area);

        sc.close();
    }    
}