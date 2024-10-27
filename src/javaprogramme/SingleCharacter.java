package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class SingleCharacter {
    public static void main(String[] args) {
        //scanner starts here
        Scanner scanner = new Scanner(System.in);
        SingleCharacter t = new SingleCharacter();
        t.inputAlphabet();


        String input = scanner.nextLine();

        //Check if input is valid (single character)
        if(input.length() != 1 || !Character.isLetter(input.charAt(0)))
        {
            System.out.println("Error: Please enter a single alphabetic character.");
            return;
        }

        char character = Character.toLowerCase(input.charAt(0));

        //Determine if the character is a vowel or consonant
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character =='u'){
            System.out.println("Input letter is Vowel ");
        }else {
            System.out.println("Input letter is Consonant ");
        }
        scanner.close();


    }
    public void inputAlphabet(){
        System.out.println("Input an alphabet: ");
    }
}
