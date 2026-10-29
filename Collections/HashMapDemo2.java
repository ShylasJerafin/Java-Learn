package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "SQL");
        map.put(4, "AL");
        System.out.println(map);
        map.clear();
        System.out.println(map);
	}

}
