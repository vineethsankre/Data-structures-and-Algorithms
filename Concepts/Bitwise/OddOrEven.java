package Concepts.Bitwise;

public class OddOrEven{
    public static void main(String[] args) {
        int num = 15;
        System.out.println(isOdd(num));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}