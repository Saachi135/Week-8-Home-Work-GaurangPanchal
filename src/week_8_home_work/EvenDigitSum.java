package week_8_home_work;

import java.util.Scanner;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSum {    // public class
    public static int evenDigitSum(int number) {  // public static method declaration

        if (number<0){
            return -1;
        }
        int lastDigit =0;
        int sum =0;   // variable assigned integer type
        while (number != 0){
            lastDigit = number % 10;
            if (number % 2 == 0){
                sum += lastDigit;
            }
            number = number /10;
        }
    return sum;   // return value assigned
    }

    public static void main(String[] args) {   // main method declaration
        Scanner scanner = new Scanner(System.in);   // scanner declaration
        System.out.println("Enter number: ");   // input request from use
        int abc = scanner.nextInt();
        int result = evenDigitSum(abc);  // scanner data input calling from static method
        System.out.println("The sum of even digits is: " + result);

    scanner.close(); // closing scanner object
    }
}
