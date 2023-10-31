package javaweek4homework;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class DiamondPattern {

    //method to print diamond pattern
    public static void m1(int i, int n) {
        // Upper half of the diamond
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Lower half of the diamond
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        int n = 6; // size of the diamond
        int i = 1;
        m1(i, n);
    }
}
