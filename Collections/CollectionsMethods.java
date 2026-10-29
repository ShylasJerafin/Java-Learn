package Collections;

import java.util.*;

public class CollectionsMethods {

	public static void main(String[] args) {

			Collection<String> obj = new ArrayList<>();
			System.out.println(obj.isEmpty());
			System.out.println(obj.size());
			obj.add("Java");
			obj.add("Python");
			obj.add("SQL");
			System.out.println("Add and AddAll");
			System.out.println(obj);
			Collection<String> obj1 = Arrays.asList("AL","PHP","C#");
			System.out.println(obj1);
			obj.addAll(obj1);
			System.out.println(obj);
			System.out.println();
			System.out.println("Remove and RemoveAll");
			System.out.println(obj.containsAll(obj1));
			obj.remove("C#");
			System.out.println(obj);
			obj.removeAll(obj1);
			System.out.println(obj);
			System.out.println();
			System.out.println("isEmpty, size, conatins and containsAll and clear");
			System.out.println(obj.isEmpty());
			System.out.println(obj1.isEmpty());
			System.out.println(obj.size());
			System.out.println(obj.contains("SQL"));
			System.out.println(obj.containsAll(obj1));
			obj.clear();
			System.out.println(obj);
			System.out.println(obj.isEmpty());
			
			String[] newarr = (String[]) obj1.toArray(new String[0]);
			
			for(String s:newarr) {
				System.out.print(s+ ", ");
			}
			
			
//			Collection<Integer> obj2 = new ArrayList<>();
//			obj2.add(1);
	}

}
