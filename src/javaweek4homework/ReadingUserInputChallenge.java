package javaweek4homework;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class ReadingUserInputChallenge {
    int sum = 0;
    int x = 1;  //printing "Enter number #1", #2 and so on

    public static void main(String[] args) {
        ReadingUserInputChallenge t = new ReadingUserInputChallenge();
        t.m1();
    }

    //method to read integers from console and sum up all.
    public void m1() {
        Scanner scanner = new Scanner(System.in);
        while (x <= 10) {
            System.out.println("Enter number #" + x);
            x++;
            //hasNextInt method to verify entered input is integer
            if (scanner.hasNextInt()) {
                //nextInt method for reading integers from console and add it to current sum
                int number = scanner.nextInt();
                sum += number;
                //print the sum of all entered integers
                System.out.println("The sum of entered numbers is " + sum);
            } else {
                System.out.println("False, Invalid Number");
            }
        }
        scanner.close(); //scanner close
    }
}
