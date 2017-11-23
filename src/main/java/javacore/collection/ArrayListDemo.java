package javacore.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Foo");
        list.add("Bar");

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Baz");
        list1.add("Boo");
        list.addAll(list1);
        list.remove("Bar");

        list.forEach(m-> System.out.println(m.toString()));
        list.removeIf(m->m.equals("Boo"));

        System.out.println("Elements: "+list.size());
        for (Object o : list)
            System.out.println(o.toString());

        //System.out.println(list.get(0));


    }
}
