package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",3);
        map.put("key4",4);

        map.remove("key1");
        map.keySet().forEach(k-> System.out.println(k));
        map.values().forEach(v-> System.out.println(v));

        map.clear();

        map.keySet().forEach(k-> System.out.println(k));
        map.values().forEach(v-> System.out.println(v));

    }

}
