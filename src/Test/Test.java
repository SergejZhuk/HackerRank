package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int str = in.nextInt();
            System.out.println(str);
            //String IP = in.next();
          //  System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}