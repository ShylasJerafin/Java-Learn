package problemsolving;

public class TaskDemo {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(C.c);
	}
}

class A{
	static int a;
	static int b;
	
}

class B{
	static {
		A.a=10;
		A.b=20;
	}
}
class C{
	static int c = A.a + A.b;
}

