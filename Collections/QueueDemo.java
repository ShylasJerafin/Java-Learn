package Collections;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>(); //Collections.reverseOrder() - Max heap sort
		System.out.println("Queue - PriorityQueue - maintains min heap sort order");
		System.out.println("add(), offer()");
		q.offer(10);
		q.offer(5);
		q.offer(50);
		q.offer(30);
		q.offer(25);
		//q.add(null);
		System.out.println(q);
		System.out.println("poll() - Retrieves and removes the head of this queue same as remove() - "+q.poll());
		System.out.println(q);
		System.out.println("peek() - Returns the head - "+q.peek());
		System.out.println("element() - Returns head same as peek() - "+q.element());
		System.out.println(q);
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		q1.offer(10);
		q1.offer(5);
		q1.offer(50);
		q1.offer(30);
		q1.offer(25);
		System.out.println();
		System.out.println("Just checking - is the priority queue follows the min-heap sort too - it does");
		System.out.println(q1);
		System.out.println();
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.add(17);
		queue.add(67);
		queue.add(12);
		queue.push(30);
		queue.offer(35);
		System.out.println("push() - inserts the value to the head");
		System.out.println("ArrayDeque - maintains insertion order");
		System.out.println(queue);
		queue.poll();
		System.out.println("poll() - removes the first element same as pollfirst() \n"+queue);
		System.out.println();
		
		
	}

}
