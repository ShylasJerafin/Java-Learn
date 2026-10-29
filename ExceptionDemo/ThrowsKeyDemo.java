package ExceptionDemo;

public class ThrowsKeyDemo {
	static {
		System.out.println("Class is loaded");
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}

class ThrowsDemo{
	public void show() throws ClassNotFoundException {
		Class.forName("ExceptionDemo.ThrowKeyDemo");
	}
}