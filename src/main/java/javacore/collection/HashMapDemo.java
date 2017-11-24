package javacore.collection;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("Using class HashMap");
        Map<String,String> map = new HashMap<>();
        map.put("2222","ghi");
        map.put("3333","abc");
        map.put("1111","def");
        map.forEach((k,v)-> System.out.println(k+" | "+v));
        map.replaceAll((k,v)->v.toUpperCase());
        Collection<String> collectionhash = map.values();
        collectionhash.forEach(m-> System.out.println(m));
        System.out.println(map.getOrDefault("9999","xyz"));

        System.out.println("Using class TreeMap");
        Map<String,String> treemap = new TreeMap<>();
        treemap.put("2222","ghi");
        treemap.put("3333","abc");
        treemap.put("1111","def");
        treemap.forEach((k,v)-> System.out.println(k+" | "+v));
        Collection<String> collectiontree = treemap.values();
        collectiontree.forEach(m-> System.out.println(m));

        SortedMap<String,String> sortedMap = new TreeMap<>();
        sortedMap.put("2222","ghi");
        sortedMap.put("3333","abc");
        sortedMap.put("1111","def");
        sortedMap.put("6666","xyz");
        sortedMap.put("4444","abc");
        sortedMap.put("5555","def");

        sortedMap.forEach((k,v)-> System.out.println(k+" | "+v));
        System.out.println("Using method headMap()");
        sortedMap.headMap("3333").forEach((k,v)-> System.out.println(k+" | "+v));

        System.out.println("Using method tailMap()");
        sortedMap.tailMap("3333").forEach((k,v)-> System.out.println(k+" | "+v));
    }
}
