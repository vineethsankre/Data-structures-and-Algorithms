public class SearchInMountain {
    public static void main(String[] args) {
        
    }
    int search(int[] arr, int target){
        int peak= peakIndexInMountainArray(arr);
        int firstTry =  binarySearch(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return  binarySearch(arr, target, peak + 1 , arr.length - 1);

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                //You are in dec part
                //It may be ans, but look left
                end = mid;
            } else{
                //You are in asc part
                start = mid + 1;

            }
        }
        
        return start;
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if (arr[start] < arr[end]){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } else{
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            
        }
        return - 1; // not found
    }
}
