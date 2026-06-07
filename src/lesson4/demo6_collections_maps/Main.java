package lesson4.demo6_collections_maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>();
        stringIntegerTreeMap.put("one", 1);
        stringIntegerTreeMap.put("two", 2);
        stringIntegerTreeMap.put("three", 3);
        stringIntegerTreeMap.put("four", 4);
        stringIntegerTreeMap.put("five", 5);
        System.out.println(stringIntegerTreeMap);
        Integer one = stringIntegerTreeMap.get("one");
        //    stringIntegerTreeMap.forEach((s, integer) -> {
        //        System.out.println(s + " " + integer );});
        //    Set<Map.Entry<String, Integer>> entries = stringIntegerTreeMap.entrySet();
        //    Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        //    while (iterator.hasNext()) {
        //        Map.Entry<String, Integer> next = iterator.next();
        //        if(next.getKey().equals("one")) {
        //            iterator.remove();
        //        }}
        stringIntegerTreeMap.replace("one", 111);
        stringIntegerTreeMap.entrySet().stream().collect(Collectors.toMap(new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getKey();
            }
        }, new Function<Map.Entry<String, Integer>, Integer>() {
            @Override
            public Integer apply(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getValue();
            }
        }));

    }
}







