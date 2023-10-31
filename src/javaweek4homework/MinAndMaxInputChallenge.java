package javaweek4homework;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    int min = Integer.MAX_VALUE; // Initialize min to the maximum possible value
    int max = Integer.MIN_VALUE; // Initialize max to the minimum possible value

    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.m1();
        //print min and max number
        System.out.println("The minimum number is: " + obj.min);
        System.out.println("The maximum number is: " + obj.max);
    }

    //method to read input from console and identify min and max number
    public void m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        scanner.close();
    }


}
