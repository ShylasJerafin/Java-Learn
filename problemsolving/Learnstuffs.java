package problemsolving;

public class Learnstuffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 7,b=2;
		double c =7, d=2;
		System.out.println(a/b); //3 -- both are int DT
		System.out.println(c/d); //3.5 -- both are double DT
		System.out.println(a/d); //3.5 -- one is double it is enough
		System.out.println(c/b); //3.5 -- one is double it is enough
		
		//Re-initialization
		int a1= 50;
		System.out.println("Initialze : "+a1);
		 a1 = 55;
		System.out.println("Re-Initialze : "+a1);
		//Final Keyword
		//cannot re-initailze a variable with final keyword
		final int a2 = 12;
		System.out.println("Initialze with Final Keyword : "+a2);
		// a2 = 15; - It cannot be used again
		
		//Operator Precedence
		//1-> *,/,% 2-> +,- 3-> =
		System.out.println(10+2*5+4); //24 - Multiply works first
		
		int x=10,y;
		y = x++ + x++ + x++;
		System.out.println(y); //33 -> 10 + 11 +  12
		
		int z=10,z1;
		z1 = --z - --z; //9-8
		System.out.println(z1); //1



	}

}
