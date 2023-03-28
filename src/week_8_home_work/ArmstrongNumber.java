package week_8_home_work;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber {       // public class

    public static void isArmstrongNumber(int num) {    // static method creation
        int a, b, c = 0;
        a = num;
        while (num != 0) { // while loop method
            b = num % 10;
            c = c + b * b * b;
            num /= 10;
        }
        if (c == a) {              // if condition
            System.out.println(a + " is a Armstrong number");
        } else {
            System.out.println(a + " is not a Armstrong number");
        }
    }
    public static void main(String[] args) {         // main method
        Scanner scanner = new Scanner(System.in);    // scanner declaration
        System.out.println("Enter any number : ");  // input declaration

        int xyz = scanner.nextInt();   // calling method
        isArmstrongNumber(xyz);

        scanner.close(); // scanner closed
    }

}