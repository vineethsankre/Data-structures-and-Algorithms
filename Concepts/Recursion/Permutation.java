package Concepts.Recursion;

public class Permutation {
    public static void printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            String remainingStr = str.substring(0, i) + str.substring(i+1);
            printPerm(remainingStr, permutation + ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");

    }
}
