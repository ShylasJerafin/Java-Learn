package problemsolving;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a= 10,i;
		//First assign value for i i=0, then check the condition (i<=a) - if satisfies enter the loop 
		//then increment works i++
		/*
		 * for(i=0;i<=a;i++) { a--;
		 * System.out.println("the value of a = "+a+", the value of i = "+i); }
		 */
		/* char ch;
		for (ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
		} */
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		} */
		int a,i,n=5;
		char ch = 'a';
		for (i=0;i<=n;i++)
		{
			if(i%2==0) // - Divide(/) - Quotient, Modulus(%) - Remainder
			{
				System.out.println(ch);
				ch++;
			}
			else
			{
				System.out.println("*");
			}
		}
	}

}
