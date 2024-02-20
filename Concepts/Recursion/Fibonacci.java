package Concepts.Recursion;

import java.util.Scanner;

class Fibonacci {
    public static int fib(int N){
        if (N <= 1){
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = input.nextInt();
        input.close();

        if (N < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("Fibonacci number at position " + N + " is " + fib(N));
        }
    }
}
