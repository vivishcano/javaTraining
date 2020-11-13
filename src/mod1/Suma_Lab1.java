package mod1;

import java.util.*;
import java.util.Scanner;

public class Suma_Lab1 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumN(n));
    }

    public static int sumN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = i + result;
        }
        return result;
    }



}
