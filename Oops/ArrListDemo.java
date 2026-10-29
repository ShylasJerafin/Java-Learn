package Oops;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {

	public static void main(String[] args) {
		//Homogeneous
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(4, 400);
		al.add(null);
		System.out.println(al); 
		
		ArrayList ob = new ArrayList();
		ob.add("Haii");
		ob.add('A');
		//ob.add(al);
		//ob.addAll(al);
		ob.addAll(1, al);
		System.out.println(ob);
		//Get Method
		System.out.println("Get Method");
		System.out.println(al.get(4));
		System.out.println(ob.get(0));
		
		Integer a = al.get(0);
		System.out.println(a);
		Object s1 = ob.get(0);
		//Why Type casting -> Collection topic everything is object
		String s = (String) ob.get(0);
		System.out.println(s);
		//Set Method
		System.out.println("Set Method");
		al.set(1, 22);
		System.out.println(al);
		//Remove Method
		System.out.println("Remove Method");
		al.remove(4);
		System.out.println(al);
		System.out.println(al.indexOf(30));
		System.out.println(al.lastIndexOf(ob));
	}
}
