import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length:");
        double length = sc.nextDouble();
        System.out.println("Enter Width:");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.printf("Area of Rectangle is: %.2f", area);

        sc.close();
    }    
}