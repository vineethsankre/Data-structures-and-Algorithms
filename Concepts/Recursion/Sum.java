package Concepts.Recursion;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    static int sum(int i) {
        if (i == 1){
            return i;
        }
        return i + sum(i - 1);
    }
}
