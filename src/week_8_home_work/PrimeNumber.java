package week_8_home_work;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class PrimeNumber{   // public class
    public static void isPrimeNumber(int num){  // static method created
        boolean abc = false;    // boolean value define
        for (int a = 2; a <= num/2; ++a){
            if (num % a == 0){
                abc = true;
                break;   // loop break
            }
        }

        if (!abc)
            System.out.println(num + " is a prime number.");   // printing message
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {    // created main method
        Scanner scan = new Scanner(System.in); // scanner created
        System.out.println("Enter any number: ");  // data input from console
        int xyz = scan.nextInt();
        isPrimeNumber(xyz);   // static method called

        scan.close();  // close scanner
    }
}
