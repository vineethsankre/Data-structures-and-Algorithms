package Concepts.Bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3 , 5, 6, 5, 3};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int N :arr){
            unique ^= N;
        }
        return unique;
    }
}
