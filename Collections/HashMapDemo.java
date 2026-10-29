package Collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "SQL");
        map.put(4, "C/AL");
        System.out.println("\nAfter put()      : " + map);
        map.put(4, "AL");
        System.out.println("After add a value in a existing key"+map);
        
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(5, null);
        m1.put(6, "RDLC");
        map.putAll(m1);
        System.out.println("After putAll()  : "+map);
        System.out.println();
        System.out.println(map.get(1));
        System.out.println(m1.get(1)); // There is no key as 1 - so it shows null in the output
        System.out.println();        
        System.out.println("containsKey(2)        : " + map.containsKey(2));
        System.out.println("containsKey(50)       : " + map.containsKey(50)); 
        System.out.println("containsValue(\"AL\")   : " + map.containsValue("AL")); 
        System.out.println("containsValue(\"C/AL\") : " + map.containsValue("PHP"));
        System.out.println();
        System.out.println("Size() - "+map.size());
        System.out.println("Size() - "+m1.size());
        System.out.println();
        //map.remove(m1);
        map.remove(5);
        System.out.println("Afer using remove"+map);
        System.out.println();
        
        Set<Integer> keys = map.keySet();
        Collection<String> vals = map.values();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        
        System.out.println("keySet()   : " + keys);
        System.out.println("values()   : " + vals);
        System.out.println("entrySet() : " + entries);
        
        System.out.println("\nITERATION");
        
        // (a) Using keySet() -> get value with map.get(key)
        System.out.println("   a) keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("      " + key + " -> " + map.get(key));
        }
 
        // (b) Using values() -> values only, no keys
        System.out.println("   b) values():");
        for (String value : map.values()) {
            System.out.println("      " + value);
        }
 
        // (c) Using entrySet() -> getKey() and getValue() (most efficient)
        System.out.println("   c) entrySet() with getKey()/getValue():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("      " + entry.getKey() + " -> " + entry.getValue());
        }
 
        // (d) Using forEach() with a lambda (Java 8+)
        System.out.println("   d) forEach():");
        map.forEach((k, v) -> System.out.println("      " + k + " -> " + v));
	}
}
