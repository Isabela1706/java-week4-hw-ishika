package javaprogramme;

/**
 *
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        //Call the instance method
        MinAndMaxInputChallenge t = new MinAndMaxInputChallenge();
        t.findMinAndMax();


    }
    //Instance method
    public void findMinAndMax(){
        //scanner starts here
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // Initialize min to maximum possible value
        int max = Integer.MIN_VALUE; // Initialize max to minimum possible value

        while (true){
            System.out.println("Enter number: ");
            String input = scanner.nextLine();

            //Try to parse the input as an integer
            try {
                int number = Integer.parseInt(input);

                //Update min and max
                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
            } catch (NumberFormatException e){
                //Invalid input, break the Loop
                break;
            }
        }
        //Check if any numbers were entered
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("No valid numbers entered.");
        }else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximun number: " + max);

        }
        //scanner close here
        scanner.close();


    }
}
