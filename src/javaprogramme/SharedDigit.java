package javaprogramme;

/**
 * Shared Digit
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

public class SharedDigit {
    public static void main(String[] args) {
        //Calling static here directly
        System.out.println("hasSharedDigit(12, 23): " + hasSharedDigit(12,23));//Expected output: true
        System.out.println("hasSharedDigit(9, 99): " + hasSharedDigit(9,99));//Expected output: false
        System.out.println("hasSharedDigit(15, 55): " + hasSharedDigit(15,55));//Expected output: true
        System.out.println("hasSharedDigit(12, 34): " + hasSharedDigit(12,34));//Expected output: false

    }
    //Static method
    public static boolean hasSharedDigit(int num1, int num2){
        //Check if both numbers are in the valid range
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }
        //Get the digits of the first number
        int num1FirstDigit = num1 / 10;
        int num1SecoundDigit = num1 % 10;

        //Check if either digit of num1 is present in num2
        return (num1FirstDigit == num2 / 10 || num1FirstDigit == num2 % 10 || num1SecoundDigit == num2 / 10 || num1SecoundDigit == num2 % 10);
    }
}
