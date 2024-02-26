import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  bubble(int arr[]){ 
        boolean swapped;
        //Run steps N - 1 times
        for (int i = 0; i< arr.length; i++){
            swapped = false;
            //For each step, max item will come at the respective index
            for (int j = 1;  j < (arr.length - i); j++) {
                //Swap if item is smaller than the previous element
                if (arr[j] < arr[j- 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            } 
            //If you did not swap for a particular value of i, it means the array is sorted Hence, stop the program.
            if (!swapped){
                break;
            }
        }
        

    }
}
