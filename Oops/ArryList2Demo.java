package Oops;

import java.util.*;

public class ArryList2Demo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		List<Integer> list1 = Arrays.asList(10,20,3,4,50);
		
//		System.out.println(list);
//		System.out.println(list1);
//		list.removeAll(list1);
//		System.out.println(list);
//		list.retainAll(list1);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		System.out.println(list.isEmpty());
//		System.out.println();
		//System.out.println( list.subList(0, 4));
		//System.out.println(list.remove(1));
//		System.out.println(list);
//		list.remove(1); //remove using index
//		
//		System.out.println(list);
		//System.out.println(list.sort(null));
		System.out.println(list.size());
		System.out.println(list.contains(50));
		System.out.println(list.indexOf(40));
		System.out.println(list.lastIndexOf(30));
	}
}
