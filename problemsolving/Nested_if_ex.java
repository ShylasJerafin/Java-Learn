package problemsolving;

import java.util.Scanner;
public class Nested_if_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int a = in.nextInt();
		System.out.println("Enter the Gender M/F : ");
		char c = in.next().charAt(0);
		if (c=='m'||c=='M')
		{
			if (a>24)
			{
			System.out.println("He is Eligble");
			}
			else
			{
				System.out.println("He is not Eligible");
			}
		}
		else if (c=='f'||c=='F') 
		{
			if  (a>18)
			{
			System.out.println("She is Eligible");
			}
			else
			{
				System.out.println("She is not Eligible");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
