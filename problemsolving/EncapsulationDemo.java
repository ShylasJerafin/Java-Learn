package problemsolving;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Empl e = new Empl();
		e.setID(101);
		e.setName("Jera");
		System.out.println("ID :"+e.getID());
		System.out.println("Name :"+e.getName());
	}
}

class Empl{
	private int empID;
	private String empName;
	
	public void setID(int id) {
		this.empID=id;
	}
	public void setName(String name) {
		this.empName=name;
	}
	public int getID() {
		return empID;
	}
	public String getName() {
		return empName;
	}
}