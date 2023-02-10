package JavaStringTokens_18;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] words = s.trim().split("[ !,?._'@]");
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        // Write your code here.
        // scan.close();

    }
}