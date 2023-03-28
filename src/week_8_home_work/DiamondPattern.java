package week_8_home_work;

import java.util.Scanner;

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
public class DiamondPattern {
    public static void main(String[] args) {    // main method
        Scanner scan = new Scanner(System.in);  // Declared scanner
        System.out.println("Enter the number of row : ");  // user input
        int xyz = scan.nextInt();
        System.out.println("Enter the symbol : ");
        char abc = scan.next().charAt(0);
        pattern(xyz, abc);
        scan.close();
    }

    public static void pattern(int r, char ch) {  //Static method declared
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }
}
