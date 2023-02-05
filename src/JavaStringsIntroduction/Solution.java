package JavaStringsIntroduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int lenghtA = A.length();
        int lenghtB = B.length();
        int result = lenghtA + lenghtB;
        System.out.println(result);

        char[] letterA = A.toCharArray();
        char[] letterB = B.toCharArray();
        if (letterA[0] > letterB[0]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.print(A.substring(0, 1).toUpperCase()+ A.substring(1)+ " ");
        System.out.println(B.substring(0, 1).toUpperCase()+ B.substring(1));
    }
}
