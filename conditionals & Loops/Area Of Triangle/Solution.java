import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base:");
        double base = sc.nextDouble();
        System.out.println("Enter Height:");
        double height = sc.nextDouble();

        double area = (base * height) / 2;
        System.out.printf("Area of Triangle is: %.2f", area);

        sc.close();
    }    
}