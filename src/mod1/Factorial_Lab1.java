package mod1;

import java.util.Scanner;

public class Factorial_Lab1 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }

}
