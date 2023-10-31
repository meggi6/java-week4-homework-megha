package javaweek4homework;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class PrintFibonacciSeries {

    public static int m1(int n) {
        if (n <= 1) {
            return n;
        }
        return m1(n-1) + m1(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for fibonacci series :");
        int n = scanner.nextInt();
        scanner.close();

        // Print Fibonacci sequence
        for (int i = 0; i < n; i++) {
            System.out.print(m1(i) + " ");
        }
    }
}
