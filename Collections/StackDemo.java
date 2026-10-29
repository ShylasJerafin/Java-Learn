package Collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(150);
		System.out.println("push");
		System.out.println(s);
		System.out.println("pop() - returns and removes the top element in the stack - "+s.pop());
		System.out.println(s);
		System.out.println("peek - returns the top element in the stack - "+s.peek());
		System.out.println("search - search the value from top to bottom and returns its position - "+s.search(200));
		
		System.out.println();
		Stack<Integer> s1 = new Stack<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		//Just Testing
		System.out.println(s1);
		

	}
}
