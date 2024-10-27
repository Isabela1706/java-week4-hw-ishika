package javaprogramme;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 *
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class EvenOddDigitSum {
    public static void main(String[] args) {
        //Test case for the getEvenDigitSum method
        System.out.println("getEvenDigitSum(123456789): " + getEvenDigitSum(123456789));// Expected output: 20
        System.out.println("getEvenDigitSum(252): " + getEvenDigitSum(252));// Expected output: 4
        System.out.println("getEvenDigitSum(-22): " + getEvenDigitSum(-22));// Expected output: -1

    }
    //Static method
    public static int getEvenDigitSum(int number){
        //Return -1 for negative numbers
        if(number < 0){
            return -1;
        }
        int sum = 0;

        //Process each digit of the number
        while (number > 0){
            int digit = number % 10; //Extract the last digit

            //Check if the digit is even
            if (digit % 2 == 0){
                sum += digit; //Add to sum if even
            }
            number /= 10; //Remove the last digit
        }
        return sum; //Return the sum of the evn digits
    }
}
