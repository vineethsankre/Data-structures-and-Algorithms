import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicates {
    // Main method to test the functionality of the findDuplicates method
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    // Method to find all duplicate numbers in an array
    // The method uses a different approach to identify duplicates
    // It uses a while loop to iterate through the array
    // If the current element is not at its correct position, it swaps the current element with the element at its correct position
    // After the while loop, another loop is used to iterate through the array and identify the duplicate numbers
    // The duplicate numbers are stored in a List and returned as the result
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i< nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            }else{
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index< nums.length ;index ++){
            if (nums[index] != index + 1){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}