package Pack1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Grapes");
		
		//1st way of using consumer
		/*
		Consumer<String> con = new Consumer<String>() { 
			public void accept(String n) {
				System.out.println(n);
			}
		};
		*/
		
		//2nd way of using consumer with lambdaExpression
		//fruits.forEach(n -> System.out.println(n));
		
		//method reference
		fruits.forEach(System.out::println);
		
	}
}
/*
-->when we call for each with consumer object
then internally consumer method will take the elements in the list
*/
