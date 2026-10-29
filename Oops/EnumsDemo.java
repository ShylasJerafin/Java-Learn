package Oops;

import java.util.Arrays;

//Enum is a class - but cannot extends it to any other class 
//Can define methods, variables, constructors

enum Status{
	//Status is a Class -- Running and so on are Objects
	Running,Pending,Failed,Success; //Named Constants -- Objects
}

public class EnumsDemo {

	public static void main(String[] args) {
		Status ob = Status.Failed;
		System.out.println(ob);
		System.out.println(ob.ordinal()); //shows the index number
		
		System.out.println(ob.getClass().getSuperclass());
		
		Status[] obj = Status.values();
		System.out.println(Arrays.toString(obj));
		
//		for(Status s: obj) {
//			System.out.println(s+" : "+s.ordinal());
//		}
		//using switch
		switch(ob) {
		case Running:
			System.out.println("All Good");
			break;
		case Pending:
			System.out.println("Wait");
			break;
		case Failed:
			System.out.println("Try Again");
			break;
		default:
			System.out.println("Done");
			break;
		}
		//using else-if
		if(ob==Status.Running) {
			System.out.println("All Good");
		}
		else if(ob==Status.Pending) {
			System.out.println("Wait");
		}
		else if(ob==Status.Failed) {
			System.out.println("Try Again");
		}
		else {
			System.out.println("Done");
		}

	}
}
