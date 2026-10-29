package Oops;

import java.util.ArrayList;
import java.util.List;

public class UdemyDemo1 {

	public static void main(String[] args) {
		Machine fan = new Fan("Fan");
		Machine washer = new WashingMachine("Washing Machine");
		System.out.println(fan.start());
		System.out.println( washer.start());
		
		List<Integer> list = new ArrayList<>();
		

	}

}

interface Machine{
	String start();
}

abstract class Appilance implements Machine{
	String name;

	public Appilance(String name) {
		this.name = name;
	}
}

class Fan extends Appilance{

	public Fan(String name) {
		super(name);
	}

	@Override
	public String start() {
		return "Fan is running";
	}
}

class WashingMachine extends Appilance{

	public WashingMachine(String name) {
		super(name);
	}

	@Override
	public String start() {
		return "Washing Machine is running";
	}
}


