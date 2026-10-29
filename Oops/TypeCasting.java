package Oops;

public class TypeCasting {

	public static void main(String[] args) {
		
//		Dog d = new Dog();
//        Animal a = d;     // Upcasting
//        a.sound();
		
		Animal a = new Dog();
		a.sound();
		a.disp();
		
		
	}
}

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
    void disp() {
        System.out.println("Displaying");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog says Woof");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}
