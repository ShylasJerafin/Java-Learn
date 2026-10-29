package problemsolving;

public class typecasting {
	
public static void main(String[] args) {
	
	//Widening Casting (Automatic Casting) - Smaller type → larger type
	// byte → short → int → long → float → double
	int a =8;
	double b = a;
	System.out.println("Widening Casting "+b);
	
	//Narrowing Casting (Manual Casting) - Larger type → smaller type
	// Decimal part gets removed - Not rounded
	double c = 15.5;
	int d = (int) c;
	System.out.println("Narrowing Casting "+d);
	
}

}

/*
  int a = 5;
int b = 2;
double c = a / b;
System.out.println(c); -- 2.0
Why not 2.5?
Because: a / b happens first as integer division.

double c = (double)a / b; - 2.5
 */
