import java.util.Scanner;

public class Fibo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n:");
    int n = sc.nextInt();

    printFibo(n);
  }

  private static void printFibo(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(fibo(i));
    }
  }

  private static int fibo(int n) {
    if (n <= 1) return n;
    return fibo(n - 1) + fibo(n - 2);
  }
}
