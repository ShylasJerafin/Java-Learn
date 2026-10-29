package ExceptionDemo;

class JeraException extends Exception{

	public JeraException(String msg) {
		super(msg);
	}
	
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		try {
			 j=10/i;
			if(j==0) {
				throw new JeraException("Custom Exception throws");
			}
		}
		catch(JeraException e) {
			
			System.out.println("New Exception "+e);
		}
	}
}

