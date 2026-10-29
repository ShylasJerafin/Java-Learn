package problemsolving;

import java.util.Scanner;

public class Do_Whie_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = sc.nextInt();
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a<=n);

	}

}
