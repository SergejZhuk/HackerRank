package JavaEndoffile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int count = 1;
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
         }
    }
}
