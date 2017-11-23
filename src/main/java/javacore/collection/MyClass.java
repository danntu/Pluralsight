package javacore.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MyClass implements Comparable<MyClass> {
    String lsbel,value;
    @Override
    public int compareTo(MyClass o) {
        return  value.compareToIgnoreCase(o.value);
    }

    @Override
    public boolean equals(Object obj) {
        MyClass o = (MyClass) obj;
        return value.equalsIgnoreCase(o.value);
    }

    public MyClass(String lsbel, String value) {
        this.lsbel = lsbel;
        this.value = value;
    }

    public String getLsbel() {
        return lsbel;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        TreeSet<MyClass> tree =  new TreeSet<>(new MyComparator());
        tree.add(new MyClass("2222","ghi"));
        tree.add(new MyClass("3333","abc"));
        tree.add(new MyClass("1111","def"));

        tree.forEach(m-> System.out.println(m.getLsbel()+" "+ m.getValue()));
    }
}
class MyComparator implements Comparator<MyClass>{
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getLsbel().compareToIgnoreCase(o2.getLsbel());
    }
}
