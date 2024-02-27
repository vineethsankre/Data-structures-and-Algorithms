package Concepts.Recursion.Easy;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = product(515);
        System.out.println(ans);
    }

    static int product(int N) {
        if (N <= 1){
            return 1;
        }

        return N % 10 * product(N / 10);
    }
}
