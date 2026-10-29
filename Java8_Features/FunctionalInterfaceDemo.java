package Java8_Features;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
//		Demo obj = new Demo() {
//			public void show() {
//				System.out.println("In Show");
//			}
//		};
//		obj.show();
		
		Demo obj = () -> System.out.println("Hi, Man.. ");
		obj.show();
		
		//Demo1 ob = (int j) -> System.out.println("Bye Man.. "+j);
		Demo1 ob = j -> System.out.println("Bye Man.. "+j);
		ob.run(15);
		
//		Demo2 d = new Demo2() {
//			public int add(int i,int j) {
//				return i+j;
//			}
//		};
		
		//Demo2 d = (int i,int j) -> i+j;
		Demo2 d = (i,j) -> i+j;
		int res = d.add(10, 5);
		System.out.println(res);
	}
}

@FunctionalInterface
interface Demo{
	void show();
}


@FunctionalInterface
interface Demo1{
	void run(int i);
}

@FunctionalInterface
interface Demo2{
	int add(int i,int j);
}
