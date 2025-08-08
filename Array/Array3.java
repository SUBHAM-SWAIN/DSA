package Array;

public class Array3 {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 3, 7, 8, 4, 5 };
        int num = 6;
        int sum = 0;
        Boolean isSorted = true;
        int count = 0;
        int divisibleBy = 0;
        int largest = Integer.MIN_VALUE;
        int unique = 0;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Boolean isUnique = true;

            // find index
            if (num == arr[i]) {
                System.out.println("at index:" + i);
            }
            // divisible by 3
            if (arr[i] % 3 == 0) {
                divisibleBy++;
            }
            // largest
            if (arr[i] > largest) {
                SecondLargest = largest;
                largest = arr[i];
            }

            // sorted
            if (i < arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                }
            }
            // sum
            sum = sum + arr[i];
            // number of even and odd
            if (arr[i] % 2 == 0) {
                count++;
            }

            // uniqe element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                }
            }

            if (isUnique) {
                unique++;
            }

        }
        System.out.println("Largest:" + largest);
        if (isSorted) {
            System.out.println("sorted");
        } else {
            System.out.println("Not sorted");
        }
        System.out.println("Divisible By 3:" + divisibleBy);
        System.out.println("Second Largest:" + SecondLargest);
        System.out.println("sum " + sum);
        System.out.println("even " + count);
        System.out.println("odd:" + (arr.length - count));
        System.out.println("Number Of unique Element:" + unique);
    }
}
