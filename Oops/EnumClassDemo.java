package Oops;


enum Laptop{
	Mac(2500),Hp(1800),Asus(2500),Dell;
	
	private int price;

	private Laptop() {
		this.price=1500;
	}

	private Laptop(int price) {
		this.price = price;
		System.out.println("In Laptop "+ this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
public class EnumClassDemo {

	public static void main(String[] args) {
		
		for(Laptop l: Laptop.values()) {
			System.out.println(l+" : "+l.getPrice());
		}	
	}
}

