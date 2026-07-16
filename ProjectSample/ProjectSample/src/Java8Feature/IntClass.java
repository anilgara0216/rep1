package Java8Feature;

public class IntClass implements Int1 {
	public void M1() {
		System.out.println("Implementing Functional Interface");
	}
	public static void main(String[] args) {
		Int1 i = new IntClass();
		i.M1();
			
	}

}
