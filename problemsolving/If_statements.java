package problemsolving;

import java.util.Scanner;

public class If_statements {

	public static void main(String[] args) {
		
		//Conditions - 1.Has to be Married 2.Unmarried Male above 30 years of age and Female above 25 years
		// TODO Auto-generated method stub
		System.out.println("Enter the Value ");
		Scanner o = new Scanner(System.in);
		char mar = o.next().charAt(0);
		if (mar=='m' || mar=='M')
		{
		System.out.println("Eligible");	
		}
		else if (mar=='u' || mar=='U')
		{
			System.out.println("Enter the Gender M/F");
			char gender = o.next().charAt(0);
			System.out.println("Enter the Age");
			int age = o.nextInt();
			if ((gender=='m' || gender=='M') && (age>=30))
			{
				System.out.println("Eligible");
			}
			else if ((gender=='f' || gender=='F') && (age>=25))
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
