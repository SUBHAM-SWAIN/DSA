package Array;

public class array1 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
