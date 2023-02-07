package JavaStringTokens;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] words = s.trim().split("[ ,!?._'@]");
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(words[i], "")) {
                sum++;
            }
        }
        System.out.println(sum);
        for (int j = 0; j < words.length; j++) {
            if (!Objects.equals(words[j], "")) {
                System.out.println(words[j]);
            }
        }
         scan.close();

    }
}