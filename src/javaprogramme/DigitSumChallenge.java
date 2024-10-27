package javaprogramme;

/**
 * Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */

public class DigitSumChallenge {
    public static void main(String[] args) {
        //Test cases for the sumDigits method
        System.out.println("Sum of digits in 125 : " + sumDigits(125));//Expected output:
        System.out.println("Sum of digits in 1: " + sumDigits(1));//Expected output:
        System.out.println("Sum of digits in -5 : " + sumDigits(-5));//Expected output:
        System.out.println("Sum of digits in 10 : " + sumDigits(10));//Expected output:
        System.out.println("Sum of digits in 999 : " + sumDigits(999));//Expected output:
        System.out.println("Sum of digits in 0 : " + sumDigits(0));//Expected output:


    }
    //Static method
    public static int sumDigits(int number){
        //Check for invalid input
        if (number < 10){
            return  -1;
        }
        int sum = 0;
        //Process each digit
        while (number > 0){
            sum += number % 10;//Extract the least-significant digit
            number /=10;      //Remove the least-significant digit
        }
        return sum; //Return the sum of the digits

    }
}
