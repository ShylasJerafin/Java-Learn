package Collections;

import java.util.*;


public class CollectionClass {

	public static void main(String[] args) {
		
		List<String> al = Arrays.asList("Jera","Shylas","Graceson","Joel","Saravana","Jera");
		System.out.println("----------- Collection Class Methods ----------");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Sort - "+al);
		Collections.reverse(al);
		System.out.println("Reverse - "+al);
//		Collections.shuffle(al);
//		System.out.println("Shuffle - "+al);
		Collections.swap(al, 2, 0);
		System.out.println("Swap - "+al);
		System.out.println("Max - "+Collections.max(al));
		System.out.println("Min - "+Collections.min(al));
		System.out.println("Frequency - "+Collections.frequency(al, "Jera"));
		Collections.replaceAll(al, "Shylas", "Shylu");
		System.out.println("After replaceAll() - "+al);
		Collections.fill(al, "Buddies");
		System.out.println("Fill - "+al);
		

	}
}
