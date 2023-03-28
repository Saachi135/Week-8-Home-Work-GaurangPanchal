package week_8_home_work;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class LeftAngleTriangle {

    public static void leftangle(){    // static method created
        int rows = 6;
        for (int x = 1; x <= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
        public static void main(String[] args) {    // main method
            leftangle();                            // calling from static method
        }
    }


