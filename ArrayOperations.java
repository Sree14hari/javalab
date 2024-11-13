//set 4
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    private int[] numbers;

    // Constructor to initialize the array
    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    // Method to sort the array
    public void sort() {
        Arrays.sort(numbers);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
    }

    // Method to replace a specified number with another number
    public void replace(int oldValue, int newValue) {
        boolean replaced = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == oldValue) {
                numbers[i] = newValue;
                replaced = true;
            }
        }
        if (replaced) {
            System.out.println("Array after replacing " + oldValue + " with " + newValue + ": " + Arrays.toString(numbers));
        } else {
            System.out.println("Number " + oldValue + " not found in the array.");
        }
    }

    // Method to display the array
    public void displayArray() {
        System.out.println("Current array: " + Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the array through user input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Create an instance of ArrayOperations
        ArrayOperations arrayOps = new ArrayOperations(inputArray);

        // Display the original array
        arrayOps.displayArray();

        // Call sort method and display the result
        arrayOps.sort();

        // Call replace method and display the result
        System.out.print("\nEnter the number to be replaced: ");
        int oldValue = scanner.nextInt();
        System.out.print("Enter the new number: ");
        int newValue = scanner.nextInt();
        arrayOps.replace(oldValue, newValue);

    }
}
