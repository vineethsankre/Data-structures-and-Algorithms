public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 30, 40, 64, 75, 99};
        int target = 64;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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