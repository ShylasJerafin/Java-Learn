package Collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(40);
		obj.add(2, null);
		System.out.println(obj);
		ArrayList<Integer> obj2 = new ArrayList<>();
		obj2.add(10);
		obj2.add(20);
		obj2.add(10);
		System.out.println("addFirst and addLast");
		System.out.println(obj2);
		obj2.addFirst(50);
		obj2.addLast(100);
		System.out.println(obj2);
		System.out.println("Add and AddAll");
		System.out.println(obj);
		
		ArrayList obj1 = new ArrayList();
		obj1.add("Haii");
		obj1.add('J');
		obj1.addAll(1, obj);
		//obj1.addAll(obj);
		System.out.println(obj1);
		System.out.println("Get Method");
		System.out.println(obj.get(2));
		System.out.println(obj1.get(6));
		
		Integer i = obj.get(1);
		System.out.println(i);
		
		String s = (String) obj1.get(0);
		System.out.println(s);
		
		System.out.println("Set Method"); //It overwrites or replace
		obj1.set(0, "Hlo");
		System.out.println(obj1);
		System.out.println();
		System.out.println("Remove Method");
		obj1.remove(3);
		System.out.println(obj1);
		
		System.out.println();
		System.out.println("Index");
		//Index
		ArrayList<String> list = new ArrayList<>();
        list.add("Java");     // index 0
        list.add("AL");       // index 1
        list.add("SQL");      // index 2
        list.add("Java");     // index 3  (duplicate of index 0)
        list.add("RDLC");     // index 4
        list.add("AL");       // index 5  (duplicate of index 1)
        System.out.println("List : " + list);
        System.out.println("1.Index of :"+list.indexOf("SQL"));
        System.out.println("2.Last Index of :"+list.lastIndexOf("AL"));
        System.out.println();
        System.out.println("Sort");
        list.sort(null); // null = natural (alphabetical) order
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // descending order
        System.out.println(list);
        
        System.out.println();
        System.out.println("Sub List");
        List<String> sub = list.subList(1, 4);
        System.out.println("   subList(1, 4)      : " + sub);
        
        sub.set(0, "CHANGED");
        System.out.println("   After sub.set(0,..): sub  = " + sub);
        //sub la change pannathu - list laiyum change aagi iruku
        System.out.println("                        list = " + list);
		
	}

}
