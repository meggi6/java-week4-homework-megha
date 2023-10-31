package javaweek4homework;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class PatternUsingNestedLoop {

    public static void m1(int rows) {
        char a = '@'; // assigning value to variable to print

        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 5; // number of rows to be printed
        m1(rows);
    }
}
