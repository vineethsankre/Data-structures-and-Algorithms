import java.util.Arrays;

public class SetMismatch {
    // Main method to test the findErrorNums function
    public static void main(String[] args) {
        int[] arr ={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    // Function to find the two numbers in the array that are not in their correct positions
    static int[] findErrorNums(int[] arr) {
        // Initialize the index variable to 0
        int i = 0;
        // Iterate through the array using a while loop
        while (i < arr.length) {
            // Calculate the correct index for the current element
            int correct = arr[i] - 1;
            // If the current element is not at its correct position
            if (arr[i] != arr[correct]){
                // Swap the current element with the element at its correct position
                swap(arr, i, correct);
            } else{
                // If the current element is at its correct position, increment the index
                i++;
            }
        }
        // Iterate through the array again to find the two numbers that are not in their correct positions
        for (int j = 0; j< arr.length ;j++) {
            // If the current element is not at its correct position
            if (arr[j] != j + 1) {
                // Return an array containing the two numbers that are not in their correct positions
                return new int[]{arr[j], j + 1};
            }
        }
        // If no mismatch is found, return an array containing -1 and -1
        return new int[] {-1, -1};
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int first, int second){
        // Store the value of the first element in a temporary variable
        int temp = arr[first];
        // Assign the value of the second element to the first element
        arr[first] = arr[second];
        // Assign the value of the temporary variable to the second element
        arr[second] = temp;
    }
}