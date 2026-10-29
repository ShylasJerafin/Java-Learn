package Oops;

public class AnnymousInnerClass {

	public static void main(String[] args) {
		
		A12 ab = new A12() {
			void show() {
				System.out.println("In new Show");
			}
		};
		ab.show();
		//Cannot create object to Abstract class - but can create Anonymous Inner Class
		A13 obj = new A13() {
			@Override
			public void show() {
				System.out.println("In Abstract Class");
			}
		};
		obj.show();
	}
}

class A12{
	void show() {
		System.out.println("In Show");
	}
}

//Abstract & Anonymous Inner Class
abstract class A13{
	public abstract void show();
}