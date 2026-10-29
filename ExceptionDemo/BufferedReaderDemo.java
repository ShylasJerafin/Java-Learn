package ExceptionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number");
//		int num = System.in.read();
//		//System.out.println(num); //Prints the ASCII value
//		System.out.println(num-48); //now works correctly but only works for single digit value
		
		//Here, it takes multiple values
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		int n1 = Integer.parseInt(bf.readLine());
		System.out.println(n1);
		
		bf.close();
		// These are used before Scanner class - which is introduced in Java 1.5
	}
}    