package Concepts.Recursion;

import java.util.Scanner;

class Innerfactorial {
    int fact(int N){
        if (N == 1 || N==0){
            return 1;
        }
        return fact(N - 1) * N;
    }
    
}
class factorial {
    public static void main(String[] args) {
        Innerfactorial f = new Innerfactorial();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        System.out.println("Factorial of "+ N + " is " + f.fact(N));
    }
}
