package JavaStringReverse;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        List<Character> list = new LinkedList<>();
        for(char ch: A.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());

        boolean isPalidrom = true;
        while (iterator.hasNext() && reversIterator.hasNext()){
            if(iterator.next() != reversIterator.next()){
                isPalidrom = false;
                break;
            }
        }
        /* Enter your code here. Print output to STDOUT. */

    }
}
