package java8;

import java.util.*;

public class ComporatorLambda {
    public static void main(String[] args) {
        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };

        Comparator<String> comp2 = (String s1,String s2)->
                Integer.compare(s1.length(),s2.length());
        System.out.println("Simple");
        List<String> list1 = Arrays.asList("***","**","****","*");
        Collections.sort(list1,comp1);
        for (String s:
             list1) {
            System.out.println(s);
        }
        System.out.println("Lambda");
        List<String> list2 = Arrays.asList("***","**","****","*");
        Collections.sort(list2,comp2);
        for (String s:
                list2) {
            System.out.println(s);
        }
    }
}
