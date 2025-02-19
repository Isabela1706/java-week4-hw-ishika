package javaprogramme;

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

import java.util.Scanner;



public class DiamondPattern {
    public static void main(String[] args) {
        DiamondPattern programme14DiamondPattern=new DiamondPattern();
        programme14DiamondPattern.pattern(); // method calling

    }


    // declare  instance method
    public void pattern(){
        // scanner declaration
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of rows for diamond:");
        int row=scanner.nextInt();

        int i = 1; // the row count

        // generate the half diamond
        while (i<=row){
            int spaces= row-i;
            int stars= 2*i-1;


            // Print leading spaces
            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            // Print stars
            int j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Generate the lower half of the diamond
        i = row - 1;
        while (i > 0) {
            int spaces = row - i;
            int stars = 2 * i - 1;

            // Print leading spaces
            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            // Print stars
            int j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
       // scanner close
        scanner.close();
    }
}

