package week_8_home_work;

/**
 *  Read the numbers from the console entered by the user and print the minimum
 *  and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 *  number.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    // main method created
    public static void main(String[] args) {
        // Scanner method called
        Scanner scanner = new Scanner(System.in);
        // Finding maximum number and minimum number for user input
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                min = Math.min(min,number);
                max = Math.max(max,number);
            } else {
                System.out.println("Invalid input");
                break;
            }

        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
            }

        }



