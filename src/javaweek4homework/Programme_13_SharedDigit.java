package javaweek4homework;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if (!(isValid(num1) && isValid(num2))) {
            System.out.println("false");
            return false;
        }

        //storing both digit of num1 in array digit1 and both digit of num2 in array digit2
        int[] digits1 = getDigits(num1);
        int[] digits2 = getDigits(num2);

        //compare digit1 with digit2
        for (int digit1 : digits1) {
            for (int digit2 : digits2) {
                if (digit1 == digit2) {
                    System.out.println(num1 + " and " + num2 + " both shared a common digit");
                    return true;
                }
            }
        }
        System.out.println(num1 + " and " + num2 + " does not shared a common digit");
        return false;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 99; //num should between range of 10 to 99
    }

    public static int[] getDigits(int num) {
        int[] digits = new int[2];
        digits[0] = num % 10; //get last digit
        digits[1] = num / 10; //get first/remaining digit
        return digits;
    }

    public static void main(String[] args) {
        hasSharedDigit(45, 10);
    }
}

