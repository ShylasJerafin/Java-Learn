package Java8_Features;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorDemo {

	public static void main(String[] args) {

		/*	UnaryOperator<String> u1 = new UnaryOperator<>() {
			@Override
			public String apply(String val) {
				return val.toUpperCase();
			}
		}; */

		UnaryOperator<String> toUpper = val -> val.toUpperCase();
		System.out.println(toUpper.apply("Hi Jerafin"));
		
		UnaryOperator<String> trimText = String::trim;
        System.out.println(trimText.apply("   hello   "));

		UnaryOperator<String> u2=UnaryOperator.identity();
		System.out.println(u2.apply("Hi Welcome"));
		
		UnaryOperator<String> trimThenUpper = s -> trimText.andThen(toUpper).apply(s);
        System.out.println(trimThenUpper.apply("  java  "));

		//Binary Operator
		/*BinaryOperator<String> b1 = new BinaryOperator<>() {
			@Override
			public String apply(String val1, String val2) {
				return val1.concat(val2);
			}
		}; */
		
		BinaryOperator<String> b1 = (v1,v2) -> v1.concat(v2);
		System.out.println(b1.apply("Shylas ", "Jerafin"));
		
		BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20)); 
        
        BinaryOperator<Integer> max = BinaryOperator.maxBy(Comparator.naturalOrder());
        BinaryOperator<Integer> min = BinaryOperator.minBy(Comparator.naturalOrder());
        System.out.println(max.apply(15, 40));                  
        System.out.println(min.apply(15, 40));
	}
}
