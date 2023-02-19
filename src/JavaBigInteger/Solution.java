package JavaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger resultAdd =  a.add(b);
        BigInteger resultM =  a.multiply(b);
        System.out.println(resultAdd);
        System.out.println(resultM);
    }
}