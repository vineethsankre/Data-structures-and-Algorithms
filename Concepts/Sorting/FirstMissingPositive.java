public class FirstMissingPositive {
    // Main method to test the functionality of the firstMissingPositive method
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    // Method to find the first missing positive integer in an array
    static int firstMissingPositive(int[] arr) {
        // Initialize an index variable to iterate through the array
        int i = 0;

        // Iterate through the array using a while loop
        while (i < arr.length) {
            // Calculate the correct index for the current element
            int correct = arr[i] - 1;

            // Check if the current element is a positive integer and within the array bounds
            // If it is, and it is not already at its correct position, swap it with the element at its correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                // If the current element is not a positive integer or it is already at its correct position, increment the index variable
                i++;
            }
        }

        // After the sorting process, iterate through the array to find the first missing positive integer
        for (int index = 0; index < arr.length; index++) {
            // If the current element is not at its correct position (i.e., it is not equal to index + 1), return it as the first missing positive integer
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // If no missing positive integer is found, return the length of the array + 1 as the first missing positive integer
        return arr.length + 1;
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second){
        // Store the value of the first element in a temporary variable
        int temp = arr[first];

        // Assign the value of the second element to the first element
        arr[first] = arr[second];

        // Assign the value stored in the temporary variable to the second element
        arr[second] = temp;
    }
}