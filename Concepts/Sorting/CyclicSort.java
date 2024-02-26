import java.util.Arrays;

public class CyclicSort {
    // Main method to demonstrate the usage of the sort method
    public static void main(String[] args) {
        // Declare an array of integers in descending order
        int[] arr = {5, 4, 3, 2, 1};
        
        // Call the sort method to sort the array
        sort(arr);
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Method to sort the array using the cyclic sort algorithm
    static void sort(int[] arr) {
        // Initialize an index variable to 0
        int i = 0;
        
        // Iterate through the array using a while loop
        while (i < arr.length) {
            // Calculate the correct index for the current element
            int correct = arr[i] - 1;
            
            // If the current element is not at its correct position in the sorted array
            if (arr[i] != arr[correct]) {
                // Swap the current element with the element at its correct position
                swap(arr, i , correct);
            } else {
                // If the current element is at its correct position, increment the index variable
                i++;
            }
        }
    }

    // Method to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        // Store the value of the first element in a temporary variable
        int temp = arr[first];
        
        // Assign the value of the second element to the first element
        arr[first] = arr[second];
        
        // Assign the value stored in the temporary variable to the second element
        arr[second] = temp;
    }
}