package JavaStringReverse_16;

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
        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if(iterator.next() != reversIterator.previous()){
                isPalidrom = false;
                break;
            }
        }
           if(isPalidrom){
               System.out.println("Yes");
      }else
               System.out.println("No");
    }
}
