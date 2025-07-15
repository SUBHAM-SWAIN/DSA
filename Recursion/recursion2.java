package Recursion;

// print number from 1-n in increasing order.........
public class recursion2 {
    public static void printNum(int num) {
        if (num == 1) {
            System.out.println(1);
            return;
        }
        printNum(num - 1);
        System.out.println(num);

    }

    // Factorial of a number...........................................
    public static int Factorial(int num) {
        if (num == 1) {
            return 1;
        }
        int fact = num * Factorial(num - 1);

        return fact;
    }

    // sum of n natural numbers ........................................

    public static int sumOfNums(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumOfNums(n - 1);
        return sum;
    }
    // Print Nth fibonachi number........................................

    public static int fibonachi(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int Nth = fibonachi(n - 1) + fibonachi(n - 2);
        return Nth;

    }

    public static void main(String[] args) {
        printNum(10);
        System.out.println(Factorial(5));
        System.out.println(sumOfNums(2));
        System.out.println(fibonachi(4));
    }
}
