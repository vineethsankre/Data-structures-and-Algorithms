import java.util.List;
import java.util.ArrayList;

public class FindAllMissingNums {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missingNums = findAllMissingNums(arr);
        System.out.println("Missing numbers: " + missingNums);
    }

    public static List<Integer> findAllMissingNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> missingNums = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                missingNums.add(index + 1);
            }
        }
        return missingNums;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
