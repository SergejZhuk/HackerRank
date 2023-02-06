package JavaStringReverse;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        java.util.List<Character> list = new java.util.LinkedList<>();
        for(char ch: A.toCharArray()){
            list.add(ch);
        }
        java.util.ListIterator<Character> iterator = list.listIterator();
        java.util.ListIterator<Character> reversIterator = list.listIterator(list.size());

        boolean isPalidrom = true;
        while (iterator.hasNext() && reversIterator.hasNext()){
            if(iterator.next() != reversIterator.next()){
                isPalidrom = false;
                break;
            }
        }
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalidrom);
    }
}
