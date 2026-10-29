package problemsolving;
// Operators are sysmbols used to perform a particular task, based on the type of operation
public class Operators {

	public static void main(String[] args) {
		//Arithmetic Operators
		int a = 10;
		int b = 3;
		System.out.println("Arithmetic Operators");
		System.out.println("Addition : "+(a + b)); // Addition
		System.out.println(a - b); // Subtraction
		System.out.println(a * b); // Multiplication
		System.out.println(a / b); // Division
		System.out.println(a % b); // Modulus
		System.out.println("-------------------------------------------------------");
		System.out.println("Arithmetic Assignment Operators");
		//Arithmetic Assignment Operators
		/*
		  =  a = 10  a = 10
		  += a += 10 a = a + 10
		  -= , *=, /=, %=	
		 */
		int c = 123;
		System.out.println(c);
		c+=10; // c= c+10
		System.out.println(c);
		c-=10;
		System.out.println(c);
		c*=10;
		System.out.println(c);
		c/=10;
		System.out.println(c);
		c%=10; // c= c%10
		System.out.println(c);
		System.out.println("---------------------------------------------------------");
		System.out.println("Relational Operators");
		//Relational Operators - it checks the condition and returns the value with true or false
		int d = 25,e=15;
		System.out.println("Equal to : "+(d==e));
		System.out.println("Not Equal to : "+(d!=e));
		System.out.println("Greaten than : "+(d>e));
		System.out.println("Less than : "+(d<e));
		System.out.println("Greater than or Equal to : "+(d>=e));
		System.out.println("Less than or Equal to : "+(d<=e));
		System.out.println("---------------------------------------------------------");
		System.out.println("Logical Operators");
		/* Logical Operators - like Relational Operators it also returns the value with true or false
		 AND - Both conditions must be true.
		 OR  - One condition true is enough.
		 NOT - Reverses result.
		 */
		int m1= 25,m2=50;
		System.out.println("Logical AND && : "+(m1>=35 && m2>=35));
		System.out.println("Logical OR || : "+(m1>=35 || m2>=35));
		boolean status = true;
		System.out.println("Logical NOT ! : "+(!status));
		System.out.println("---------------------------------------------------------");
		System.out.println("Conditional Operators");
		//Conditional or Ternary Operators
		//? munnadi varrathu condition, if it's = true na : munnadi ullatha assign pannu illana : aprm ullatha asign pannu
		int a1=30,a2=40,a3;
		a3 = a1>a2?a1:a2;
		System.out.println("The Greatest Number is :"+a3);
		System.out.println("---------------------------------------------------------");
		System.out.println("Incremental & Decremental Operators");
		//Unary Operators - ++,-- 
		//Post Increment & Decrement - a++,a--
		//Pre Increment & Decrement - ++a,--a
		int val = 10;
		val++; // a= a+1
		System.out.println("Post Increment : "+val);
		++val;
		System.out.println("Pre Increment : "+val);
		val--;
		System.out.println("Post Decrement : "+val);
		System.out.println("---------------------------------------------------------");
		
	}

}
