package ExceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i=2;
		int j=0;
		
		int arr[]= new int[3];
		//try block - if first line itself the error throws it should not check for 
		//2nd line - it jumps to the respective catch block
		try {
			j=18/i;
			System.out.println(arr[2]);
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Length should not cross its fixed length "+e);
		}
		//It should be at the end - otherwise others become unreachable
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
			//e.printStackTrace();
		}
		System.out.println(j);
		System.out.println("The End");
	}
}
