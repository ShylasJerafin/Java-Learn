package Collections;

import java.util.*;

public class CompareToDemo implements Comparable<CompareToDemo>{
	Integer id;
	String name;
	String job;

	public CompareToDemo(Integer id, String name, String job) {
		//super();
		this.id = id;
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "CompareToDemo [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	@Override
	public int compareTo(CompareToDemo o) {
		/*
		 * if(this.id<o.id) return -1; else if(this.id>o.id) return 1; else return 0;
		 */
		return Integer.compare(this.id, o.id);
		//return id.compareTo(o.id);
		//return name.compareTo(o.name);
	}


	public static void main(String[] args) {
		ArrayList<CompareToDemo> al = new ArrayList<>();
		
		al.add(new CompareToDemo(2,"Jerafin","Developer"));
		al.add(new CompareToDemo(1,"Joel","Doctor"));
		al.add(new CompareToDemo(3,"Imman","Architect"));
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println();
		System.out.println(al);
//		for(CompareToDemo o : al) {
//			System.out.println(o);
//		}
	}
}