package java8;

import java.util.*;
import java.util.function.Consumer;

public class ComporatorLambda {
    public static void main(String[] args) {
        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };

        Comparator<String> comp2 = (String s1,String s2)->Integer.compare(s1.length(),s2.length());
        Comparator<Integer> comp3 = Integer::compare;

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

        List<Integer> list3 = Arrays.asList(7,3,4,6);

        Collections.sort(list3,comp3);
        System.out.println("Lambda without type with collection s-> System.out.print(s+\" \")");
        list3.forEach(s-> System.out.print(s+" "));

        System.out.println("Lambda without type with collection System.out::print()");
        list3.forEach(System.out::print);

        System.out.println("\nLambda without type");
        for (Integer s:
                list3) {
            System.out.print(s+" ");
        }


    }
}
