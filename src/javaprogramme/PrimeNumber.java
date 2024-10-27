package javaprogramme;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class PrimeNumber {
    public static void main(String[] args) {
//Scanner starts here
        Scanner scanner = new Scanner(System.in);

        //Input a number from the user
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        //Check if the number is prime
        if (isPrime(number)){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }
        //scanner close here
        scanner.close();
    }
    public static boolean isPrime(int number){
        //Check for numbers less then 2
        if (number <=1){
            return false;
        }
        //Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;//Number is divisible, hence not prime
            }
        }
        return true;
    }
}
