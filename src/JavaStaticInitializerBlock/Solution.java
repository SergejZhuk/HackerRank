package JavaStaticInitializerBlock;

import java.util.Scanner;

 public class Solution {

    static int B;
    static int H;
    static boolean flag = false;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        if (B >= 1 && B <= 100 && H >= 1 && H <= 100) {
            flag = true;
        }
    }

     public static void main(String[] args){
         if(flag){
             int area=B*H;
             System.out.print(area);
         }
     }
}
