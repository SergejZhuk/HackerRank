package JavaAnagrams;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        a = a.toUpperCase();
        b = b.toUpperCase();
        java.util.List<Character> list1 = new java.util.ArrayList<>();
        for (Character ch: a.toCharArray()){
            list1.add(ch);
        }
        java.util.List<Character> list2 = new java.util.ArrayList<>();
        for (Character ch: b.toCharArray()){
            list2.add(ch);
        }
        java.util.Collections.sort(list1);
        java.util.Collections.sort(list2);

        java.util.ListIterator<Character> iterator1 = list1.listIterator();
        java.util.ListIterator<Character> iterator2 = list2.listIterator();

        while (iterator1.hasNext() && iterator2.hasNext()){
            if (iterator1.next() != iterator2.next()){
                return false;
            }
        }
      return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
