package problemsolving;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = scn.nextInt();
		int a=0;
		while(a<=n) //
		{
			System.out.println(a);
			a++;
		}
	}

}
