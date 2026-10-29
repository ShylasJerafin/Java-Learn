package ExceptionDemo;

public class ThrowKeyDemo {

	public static void main(String[] args) {
		
		String str = "Haii";
		int i=0;
		int j=0;
		
		try {
			//System.out.println(str.charAt(4));
			j=18/i;
			if(j==0) {
				throw new ArithmeticException("Cannot / by 0");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero "+e);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
