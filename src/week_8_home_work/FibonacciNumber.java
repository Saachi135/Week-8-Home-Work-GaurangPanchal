package week_8_home_work;

/**
 * . Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber { // public class
    // main method
    public static void main(String[] args) {
        f();  // static method is calling to main method
    }

    public static void f() {  // static instance method is created

        int n = 8, firstTerm = 0, secondTerm = 1; // integer are assigned
        System.out.println("Fibonacci Series till " + n + "terms");
        for (int a = 1; a <= n; ++a) {
            System.out.println(firstTerm + ",");

            int nextTerm = firstTerm + secondTerm; // calculation for input
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
