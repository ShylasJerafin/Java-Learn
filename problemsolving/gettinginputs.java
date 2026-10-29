package problemsolving;

import java.util.Scanner;

public class gettinginputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*	int a,b,c;
		System.out.println("Enter the two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = (a*b) + (a*b);
		System.out.println("Result = "+c); // --
		System.out.print("Enter text: ");
		String s = sc.nextLine();
		System.out.println(s); */
		System.out.println("Enter the name");
		String s = sc.nextLine();
		System.out.println("Enter the Age");
		int a = sc.nextInt();
		System.out.println("Enter the salary");
		double d = sc.nextDouble();
		System.out.println("Name = "+s+ ", Age = "+a+", Salary = "+d);
		
	}

}

/*
 * for int DT - a = sc.nextInt();
 * for String name = sc.nextLine();
 * for double salary = sc.nextDouble();
 * for char grade = sc.next().charAt(0);
 * */
