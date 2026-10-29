package problemsolving;

public class ConstructorDemo {

	public static void main(String[] args) {
		Testing t = new Testing();
		t.eid=10;
		System.out.println(t.eid);
	}
}

class Testing{
//	int id;
//	String name;
//	double sal;
//	private Testing(int id, String name, double sal) {
//		this.id = id;
//		this.name = name;
//		this.sal = sal;
//	} // using private
	int eid;
}
