package javaprogramme;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class TriangleNumbers {
    public static void main(String[] args) {
        TriangleNumbers t = new TriangleNumbers();
        t.inputNumber();

    }
    //Instance method starts here
    public void inputNumber(){
        //Scanner starts here
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for the number of rows
        System.out.print("Input the number of rows : ");
        int rows = scanner.nextInt();

        //Generate and display the triangle pattern
        for (int i = 1; i<=rows; i++){
            for (int j=1; j <=i; j++){
                System.out.print(j);
            }
            System.out.println();//Move to the next line after each row
        }
        //Scanner is close
        scanner.close();

    }
}


