package week_8_home_work;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 */
public class Triangle {                                 // public class
    // main method declaration
    public static void main(String[] args) {            // main method
        int x, y, z;
        System.out.print("Input number: ");
    // scanner assigned
        Scanner abc = new Scanner(System.in);           // scanner declaration

        z = abc.nextInt();
        for (x = 1; x <= z; x++) {

            for (y = 1; y <= x; y++)

                System.out.print(y);

            System.out.println(" ");

            abc.close();                            // scanner close

        }
    }
}