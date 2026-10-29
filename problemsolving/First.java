package problemsolving;

public class First {
	
	public static void main(String args[]) {
		
		int num=567;
		int count =0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
