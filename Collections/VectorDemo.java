package Collections;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.addElement(30);
		v.add(10);
		v.add(20);
		v.add(20);
		v.addElement(30);
		v.add(10);
		v.add(20);
		v.addElement(30);
		v.addFirst(5);
		System.out.println("add, addElement, addFirst, addLast");
		System.out.println(v);
		System.out.println("elementAt() - returns value at the index :"+v.elementAt(0));
		System.out.println("capacity() - returns the capacity :"+v.capacity());
		v.insertElementAt(100, 2);
		System.out.println("Insert element athe the specified index");
		System.out.println(v);
		System.out.println("return first element :"+v.firstElement());
		System.out.println("return last element :"+v.lastElement());
		v.setElementAt(15, 0);
		System.out.println("setElement() - overwrites the value in the index");
		System.out.println(v);
		System.out.println("removeElement, removeFirst, removeLast");
		v.removeElementAt(2);
		v.removeFirst();
		v.removeLast();
		System.out.println(v);
		System.out.println("removeAll");
		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.addElement(30);
		System.out.println(v1);
		v1.removeAllElements();
		System.out.println(v1);
		
		Object[] arr = new Object[v.size()];
		v.copyInto(arr);
		
		for(Object o:arr) {
			System.out.print(o+", ");
		}
		System.out.println();
		v.trimToSize();
		System.out.println("Trim to size - "+v.capacity());
		v.setSize(15);
		System.out.println("setSize - "+v.capacity());
	
	}
}
