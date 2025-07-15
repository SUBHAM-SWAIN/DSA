package Recursion;

//print number from 1-n in decresing order.........
public class recursion1 {
    public static void printNum(int number) {
        if (number == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(number);
        printNum(number - 1);
    }

    public static void main(String[] args) {
        printNum(10);
    }
}
