package javaweek4homework;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z),
 * or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class VowelOrConsonant {

    //method to verify entered input is a single input and it must be letter
    public static void m1(String a) {

        //check length of input
        if (a.length() == 1) {
            char input = a.charAt(0);
            //check input is letter
            if (Character.isLetter(input)) {
                switch (Character.toLowerCase(input)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Input letter is Vowel");
                        break;
                    default:
                        System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Input is not a letter");
            }
        } else {
            System.out.println("Enter only single character");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character :");
        String a = scanner.next();
        m1(a);
        scanner.close();
    }
}
