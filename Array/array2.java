package Array;

public class array2 {
    public static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void palendrom(String str) {
        Boolean isPalendrom = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalendrom = false;
            }
        }
        if (isPalendrom) {
            System.out.println("palendrom ");
        } else {
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        int num = 2893;
        // for (int i = 1; i <= num; i++) {
        // System.out.println(i);
        // }
        int count = 0;
        int sum = 0;
        int rev = 0;
        while (num > 0) {
            num = num / 10;
            int digit = num % 10;
            sum += digit;
            rev = (digit * 10) + rev;
            count++;
        }

        System.out.println("number of digits " + (count + 1));
        System.out.println("sum" + sum);
        System.out.println(rev);
        factorial(3);
        checkPrime(2);
        palendrom("madam");

    }
}
