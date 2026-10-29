package problemsolving;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10,b=20,temp;
		 * System.out.println("Before Swapping - A = "+a+", B = "+b); temp=a; a=b;
		 * b=temp; System.out.println("After Swapping - A = "+a+", B = "+b); //Without
		 * Third Variable int x=30,y=50;
		 * System.out.println("Before Swapping - X = "+x+", Y = "+y); x = x+y; //80 y =
		 * x-y; //50 x = x-y; //30
		 * System.out.println("After Swapping - X = "+x+", Y = "+y);
		 */	
	int a = 10, b= 20;
	int temp;
	System.out.println("Before Swapping A = "+a+", B = "+b);
	temp = a;
	a = b;
	b = temp;
	System.out.println("After Swapping A = "+a+", B = "+b);
	//Without #3rd Variable
	int a1 = 50,a2 =100;
	System.out.println("Before Swapping A = "+a1+", B = "+a2);
	a1 = a1 + a2; //150
	a2 = a1 - a2; //150 - 100 = 50
	a1 = a1 - a2; //150 - 50 = 50
	System.out.println("After Swapping A = "+a1+", B = "+a2);
	
	}
}
