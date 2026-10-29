package Java8_Features;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiPredicate_Tasks {

	public static void main(String[] args) {

		//Task - 1 : Predicate: Given a List<Employee>, 
		//filter employees whose salary is greater than ₹50,000 and age is above 25.

		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Jerafin", 28, 33000, "Developer"));
		emp.add(new Employee(102, "Graceson", 24, 55000, "HR"));
		emp.add(new Employee(103, "Joel", 30, 45000, "Finance"));
		emp.add(new Employee(104, "Brindha", 27, 75000, "Dietician"));
		emp.add(new Employee(105, "Akshaya", 35, 80000, "Sales"));

		//System.out.println(emp +"\n");

		/*	Predicate<Employee> task1 = new Predicate<>() {
			@Override
			public boolean test(Employee emp) {
				if(emp.age>25&&emp.salary>50000.0)
					return true;
				else
					return false;
			}
		}; */

		Predicate<Employee> task1 = (Employee emp1) -> (emp1.age>25&&emp1.salary>50000.0);
		System.out.println("Task - 1 ");
		for(Employee em: emp) {
			if(task1.test(em)) {
				System.out.println(em);
			}
		}
		System.out.println();

		//Task - 2 :  Function: Given a List<Employee>, 
		//convert each employee's name to uppercase and collect the names into a new List.

		/*Function<Employee,String> task2 = new Function<>() {
			@Override
			public String apply(Employee e) {
				return (e.getName().toUpperCase());
			}
		}; */

		Function<Employee,String> task2 = e -> e.getName().toUpperCase();

		//System.out.println(task2.apply(new Employee(101,"Jerafin",28,55000,"IT")));

		List<String> uppercasenames = new ArrayList();
		for(Employee e:emp) {
			uppercasenames.add(task2.apply(e));
		}
		System.out.println("Task - 2 ");
		System.out.println(uppercasenames);
		System.out.println();

		//Task - 3 : BiFunction: Given two Employee objects, 
		//calculate their combined salaries and return the total salary.

		Employee e1 = new Employee(201, "Shylas", 28, 33000, "Developer");
		Employee e2 = new Employee(202, "Brindha", 28, 50000, "Doctor");
		Employee e3 = new Employee(203, "Pradeep", 28, 33000, "Developer");

		/*	BiFunction<Employee,Employee,String> task3 = new BiFunction<>() {
			@Override
			public String apply(Employee empl1, Employee empl2) {
				return "Salary - "+(empl1.getSalary()+empl2.getSalary());
			}
		}; */

		BiFunction<Employee,Employee,String> task3 = (empl1,empl2) -> "Salary - "+(empl1.getSalary()+empl2.getSalary());
		System.out.println("Task - 3 ");
		System.out.println(task3.apply(e1, e2));
		System.out.println();

		//Task - 4 : BiPredicate: Given two Employee objects, 
		//check whether both belong to the same department and have the same salary.

		/*BiPredicate<Employee,Employee> task4 = new BiPredicate<>() {
			@Override
			public boolean test(Employee et1, Employee et2) {
				if(et1.getDepartment().equals(et2.getDepartment())&&et1.getSalary()==et2.getSalary())
					return true;
				else
					return false;
			}
		}; */
		
		BiPredicate<Employee,Employee> task4 = (et1,et2) -> (et1.getDepartment().equals(et2.getDepartment())&&et1.getSalary()==et2.getSalary());
		System.out.println("Task - 4 ");
		System.out.println(task4.test(e1, e3));
		System.out.println();
		
		//Task - 5 Predicate + Function: Given a List<User>, 
		//filter users from Chennai and transform their names to uppercase
		
		List<USer> users = new ArrayList<>();
		users.add(new USer(101,"Jerafin",28,"jera@gmail.com","Tuty"));
		users.add(new USer(102,"Shylas",28,"shylas@gmail.com","Chennai"));
		users.add(new USer(103,"Pradeep",25,"pradeep@gmail.com","Chennai"));
		users.add(new USer(104,"Vishnu",23,"vishnu@gmail.com","Ammanur"));
		users.add(new USer(105,"Ranjini",23,"ranjini@gmail.com","Sankarankovil"));
		
		/*Predicate<USer> tt1 = new Predicate<USer>() {			
			@Override
			public boolean test(USer u1) {
				if(u1.getCity().equals("Chennai"))
					return true;
				else
					return false;
			}
		}; */
		Predicate<USer> tt1 = u1 -> (u1.getCity().equals("Chennai"));
		
	/*	Function<USer,String> tt2 = new Function<USer, String>() {
			@Override
			public String apply(USer u2) {
				return u2.getCity().toUpperCase();
			}
		}; */
		
		Function<USer,String> tt2 = u2 -> u2.getName().toUpperCase();
		
		List<String> uppercase = new ArrayList();
		
		for(USer u3: users) {
			if(tt1.test(u3)) {
				uppercase.add(tt2.apply(u3));
			}
		}
		System.out.println("Task - 5");
		System.out.println(uppercase);
	}
}

class Employee {
	int id;
	String name;
	int age;
	double salary;
	String department;
	public Employee(int id, String name, int age, double salary, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + "]";
	}
}

class USer{
	int id;
	String name;
	int age;
	String email,City;
	public USer(int id, String name, int age, String email, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		City = city;
	}
	@Override
	public String toString() {
		return "USer [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", City=" + City + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return City;
	}
}
