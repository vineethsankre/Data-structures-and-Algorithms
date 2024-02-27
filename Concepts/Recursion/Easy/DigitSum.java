package Concepts.Recursion.Easy;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

    static int sum(int i) {
        if (i == 0){
            return 0;
        }
        // Add the last digit to the result of
        return i % 10 + sum(i / 10);
    }

    
}
