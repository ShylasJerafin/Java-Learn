package Java8_Features;

import java.util.function.Predicate;

public class Predicate_FI_Demo implements Sample {

	public static void main(String[] args) {

		//Static Method - can be called directly using interface name and its cannot be overridden
		Sample.s2();
		//Default Method - class must implements to use it and
		Predicate_FI_Demo ref = new Predicate_FI_Demo();
		ref.s1();
		ref.s();
		
		//Predicate Function - Anonymous Class - Abstract Method
		Predicate<Integer> ageCheck = new Predicate<>() {
			@Override
			public boolean test(Integer age) {
				if(age>18)
					return true;
				else
					return false;
			}};
		System.out.println(ageCheck.test(25));
		
		//Predicate Function - Converting Anonymous Class into Lambda Expression
		//Predicate<Integer> agechk = age -> (age>18)?true:false;
		Predicate<Integer> agechk = age -> (age>18);
		System.out.println(agechk.test(22));
		
		//User Class objects
		
		User jerafin = new User("Jerafin",28,80);
		User joel = new User("Joel",19,45);
		
		//User Class - Predicate Function - Abstract Method - Anonymous Class
		
		Predicate<User> ageC = new Predicate<User>() {
			@Override
			public boolean test(User user) {
				if(user.getAge()>18)
					return true;
				else
					return false;
			}
		};
		
		Predicate<User> weightC = new Predicate<User>() {
			@Override
			public boolean test(User user) {
				if(user.getWeight()>60)
					return true;
				else
					return false;
			}
		};
		System.out.println(ageC.test(jerafin));
		System.out.println(weightC.test(jerafin));
		
		//Predicate Function using User Class - Converting Anonymous Class into Lambda Expression
		Predicate<User> checkAge = user -> (user.getAge()>18);
		Predicate<User> checkWeight = user -> (user.getWeight()>50);
		System.out.println(checkAge.test(joel));
		System.out.println(checkWeight.test(joel));
		
		//Predicate &&
		
		Predicate<User> doubleCheck = new Predicate<User>() {
			@Override
			public boolean test(User user) {
				if(user.getAge()>18&&user.getWeight()>50)
					return true;
				else
					return false;
			}
		};
		System.out.println(doubleCheck.test(joel));
		
		//Predicate Default AND, OR and NEGATE Methods
		
		Predicate<User> checkD = checkAge.and(checkWeight);
		System.out.println("AND - "+checkD.test(joel));
		
		Predicate<User> checkDoub = checkAge.or(checkWeight);
		System.out.println("OR  - "+checkDoub.test(joel));
		
		Predicate<User> checkNegate = checkAge.negate();
		System.out.println("NEGATE - "+checkNegate.test(jerafin));
		
		//Predicate Static NOT, ISEQUAL Methods
		
		Predicate<User> namecheck = user -> user.getName().equals("Joel");
		System.out.println("EQUAL - "+namecheck.test(joel));
		Predicate<User> notCheck = Predicate.not(namecheck);
		System.out.println("NOT - "+notCheck.test(joel));
		

	}
	//We can overwrite the Default Method
	@Override
	public void s1() {
		System.out.println(" Overridden Default Method");
	}

	@Override
	public void s() {
		System.out.println(" Overriden Abstract Method");	
	}
}


@FunctionalInterface
interface Sample{
	void s();

	default void s1() {
		System.out.println(" Default Method");
	}
	static void s2() {
		System.out.println(" Static Method");
	}
}

class User{
	String name;
	int age;
	int weight;
	
	public User(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
}