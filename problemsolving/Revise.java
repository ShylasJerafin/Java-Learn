package problemsolving;

import java.util.Scanner;

public class Revise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Married Status M/U : ");
		char ch = sc.next().charAt(0);
		if (ch=='m' || ch=='M') 
		{
			System.out.println("You are Eligible");
		}
		else if (ch=='u' || ch=='U')
		{
			System.out.println("Enter the Gender M/F ");
			char gender = sc.next().charAt(0);
			System.out.println("Enter the Age : ");
			int age = sc.nextInt();
			if (gender=='m' || gender=='M')
			{
				if (age>=35)
				{
					System.out.println("He is Eligible");
				}
				else
				{
					System.out.println("He is Not eligible");
				}
			}
			else if (gender=='f' || gender=='F')
			{
				if (age>=25)
				{
					System.out.println("She is Eligible");
				}
				else
				{
					System.out.println("She is Not eligible");
				}
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
