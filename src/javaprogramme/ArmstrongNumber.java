package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        //Scanner starts here
        Scanner scanner = new Scanner(System.in);

        //Input a number from the user
        System.out.println("Enter a  number: ");
        int number = scanner.nextInt();

        //Check if the number is an Armstrong number
        if (isArmstrong(number)){
            System.out.println(number + " is an Armstrong number.");
        }else{
            System.out.println(number + " is not an Armstrong number. ");
        }
        //scanner close here
        scanner.close();

    }
    public static boolean isArmstrong(int number){
        int originalNumber = number; //Store the original number
        int sum = 0;
        int digits = String.valueOf(number).length();//Calculate the number of digits

        //Calculate the sum of the digits raised to the power of the number of digits
        while (number > 0){
            int digit = number % 10; //Get the last digit
            sum += Math.pow(digit, digit);//Raise the digit to the power of the number of digits and add to sum
            number /= 10; //Remove the last digit
        }

        //Check if the sum is equal to the original number
        return sum == originalNumber;

    }
}
