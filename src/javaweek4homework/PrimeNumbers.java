package javaweek4homework;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words, prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        m1(num);
        scanner.close();
    }

    public static void m1(int num){
        if (num/num ==1  && num/1 ==1){
            System.out.println("The "+num+" is Prime number");
        } else {
            System.out.println("The "+num+" is not prime number");
        }
    }

}
