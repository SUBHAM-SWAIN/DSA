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
    // check if a arra is sorted or not ...................................

    public static boolean checkArr(int arr[], int num) {

        if (num == arr.length - 1) {

            return true;

        }

        if (arr[num] < arr[num + 1]) {
            return checkArr(arr, num + 1);
        } else {
            return false;
        }

    }

    // First occorance of a number in an
    // array........................................

    public static int firstOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] != key) {
            return firstOccur(arr, i + 1, key);
        } else {
            return i;
        }

    }

    // Last Occurance of a number in an array
    // ............................................

    public static int lastOccur(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }

        if (arr[i] != key) {
            return lastOccur(arr, key, i - 1);
        } else {
            return i;
        }
    }

    public static int powerOfX(int x, int p) {

        if (p == 1) {
            return x;
        }

        int xnm1 = powerOfX(x, p - 1);
        int Xn = x * xnm1;
        return Xn;

    }

    public static void main(String[] args) {
        // printNum(10);
        // System.out.println(Factorial(5));
        // System.out.println(sumOfNums(2));
        // System.out.println(fibonachi(4));
        int arr[] = { 1, 2, 3, 2, 6, 6, 7, 8, 7 };
        int i = arr.length - 1;
        // System.out.println(firstOccur(arr, 0, 3));
        System.out.println(lastOccur(arr, 6, i));
        System.out.println(powerOfX(2, 10));
    }
}
