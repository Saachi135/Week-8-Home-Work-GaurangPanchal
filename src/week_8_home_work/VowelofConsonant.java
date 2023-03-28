package week_8_home_work;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */
public class VowelofConsonant {                     // public class
    public static void main(String[] args) {        // main method declaration
        Scanner scanner = new Scanner(System.in);   // Scanner declaration

        System.out.println("Input a alphabet");     // print statement
        String input = scanner.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {  //if variable
            System.out.println("Error: Please enter valid alphabet");
        } else {
            char letter = input.charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' ||
                    letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input Letter is Consonant ");

            }
// scanner close
            scanner.close();                                //scanner close
        }

    }
}
