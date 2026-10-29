package problemsolving;

import java.util.Scanner;

public class Switch_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner haii = new Scanner(System.in);
		System.out.println("1.Addition, 2.Subtraction, 3.Multiplication, 4.Division ");
		int in = haii.nextInt();
		int x,y,z;
		switch(in)
		{
		case 1:
			System.out.println("Enter the two Nos : ");
			x = haii.nextInt();
			y = haii.nextInt();
			z = x + y;
			System.out.println("Addition = "+z);
			break;
		case 2:
			System.out.println("Enter the two Nos : ");
			x = haii.nextInt();
			y = haii.nextInt();
			z = x - y;
			System.out.println("Subtract = "+z);
			break;
		case 3:
			System.out.println("Enter the two Nos : ");
			x = haii.nextInt();
			y = haii.nextInt();
			z = x * y;
			System.out.println("Multiplication = "+z);
			break;
		case 4:
			System.out.println("Enter the two Nos : ");
			x = haii.nextInt();
			y = haii.nextInt();
			z = x / y;
			System.out.println("Division = "+z);
			break;
			default:
				System.out.println("Invalid Input");
		}
		/*System.out.println("Enter the Intial : ");
		char ch = haii.next().charAt(0);
		switch(ch)
		{
		case 'S':
			System.out.println("Shylas");
			break;
		case 'J':
			System.out.println("Jerafin");
			break;
		default:
			System.out.println("Invalid Input");		
		} */
	} 

}
