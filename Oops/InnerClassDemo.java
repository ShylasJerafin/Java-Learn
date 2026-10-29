package Oops;

public class InnerClassDemo {

	public static void main(String[] args) {
		A1 a = new A1();
		a.show();
		//Inner Class belongs to the outer class - So follows this syntax
		//Outer class should be public, final, abstract
		A1.A2 ab = a.new A2();
		ab.disp();
		//Inner class can be static - that follows this syntax
		A1.A3 abc = new A1.A3();
		abc.play();
	}
}

class A1{
	
	int a=10;
	
	public void show() {
		System.out.println("In Show");
	}
	// Can create inner class
	class A2{
		public void disp() {
			System.out.println("In Disp");
		}
	}
	static class A3{
		public void play() {
			System.out.println("In Play");
		}
	}
}