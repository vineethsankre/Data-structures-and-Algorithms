public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int noOfTimesRotated = findPivot(arr) + 1;
        System.out.println(noOfTimesRotated);    
    }
    static int findPivot(int[] arr){
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
                return mid-1;
            }
            //Case 3: start element >= mid
            //All elements from mid will be < start
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
                //Case 4: If start < mid
            } else{
                start =  mid + 1;
            }
            
        }
        //If no pivot found
        return -1;
    }
}
