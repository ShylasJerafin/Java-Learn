package Oops;

public class ForNameDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Oops.Helicopter");
	}

}

class Helicopter{
	static {
		System.out.println("Helicopter flies");
	}
}