package week_8_home_work;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class AngleTriangle {
    // main method
    public static void main(String[] args) {
        // Data input declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows for @ :");// message to display
        angle(scan.nextInt());

    }
// static method for data calculation
    public static void angle(int z) {

        for (int a = 0; a <=z; a++) {
            for (int h = 0; h< a; h++){
                System.out.print("@");
            }
           System.out.println(" ");
        }
    }
}
