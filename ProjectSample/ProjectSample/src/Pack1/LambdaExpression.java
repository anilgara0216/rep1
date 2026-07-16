package Pack1;

public class LambdaExpression {
	public void Display() {
		System.out.println("Implementing Lambda Expression");
		//-->If we want to assign the lambda expression to something then definitly it must be a Functional Interface and that method in that interface should be compatible(same parameters)
		
	    //(so lambda expression should be compatible with the abstract method which is present in hte functional interface)
		
		Interface1 i = ()->System.out.println("Helloooo"); //we are storing/assigning the method to the functional Interface
		
		//lambda expression providing implementation to the abstract method in the Functional Interface
		
		i.M1(); //with the help of reference we are calling method which is present in Functional Interface
		
		//whenever we are calling M1() which is present in the functional interface it will starts executing and we stored/assigned a method in that functional so that method will be printed
		System.out.println("--------------------------------------");
		Interface2 i2 = (int a, int b)->System.out.println("Addition: " + (a+b));
		i2.M2(45, 67);
		
		System.out.println("--------------------------------------");
		Interface3 i3 = (int a, int b)->
		{
			System.out.println("performing multiple line lambda expression code");
			System.out.println();
			if(a>40) {
				return 1;
			}
			else {
				return 0;
			}
		};
		System.out.println("M3() of functional interface is returning: " + i3.M3(40, 40));
	}
	public static void main(String[] args) {
		new LambdaExpression().Display();
	}

}
