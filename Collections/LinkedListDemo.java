package Collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.addFirst(5);
		list.addLast(55);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeLast();
		list.removeFirst();
		System.out.println(list);
		System.out.println(list.indexOf(20));
		System.out.println(list.isEmpty());
		System.out.println(list.contains(30));
		System.out.println(list.contains(100));
	}
}
