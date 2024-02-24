public class RBSwithDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(search(arr, target));
        
    }
    /*
     * Approch:
     * Find pivot in array, if we found, array is rotated and we can split the array in two halves and BS in two arrays
     * Find in first half -> start, pivot
     * Find in second half -> pivot + 1, end
     * Else, array is not rotated and we can do normal binary search
     */
    static int search(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);
        //return case where there is no pivot, that means not a sorted array
        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        //Case: pivot == target
        if (arr[pivot] == target){
            return pivot;
        }
        //Case:  target > start, target lies in the left side of pivot
        if (target >= arr[0] ){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        //Case: target < start, target lies in right side of pivot
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int findPivotWithDuplicates(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //Check for 4 cases to find pivot

            //Case 1: mid > mid + 1, return mid
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //Case 2: mid  < mid - 1, return mid -1
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid]==arr[end]){
                //What if start or end is pivot?
                //If start if pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }else if (arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
                
            } else{
                end = mid - 1;
            }
            
        }
        //If no pivot found
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
            
        }
        return - 1; // not found
    }
}
