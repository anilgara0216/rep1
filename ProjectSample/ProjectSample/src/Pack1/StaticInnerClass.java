package Pack1;

public class StaticInnerClass {
	
	StaticInnerClass() {
		System.out.println("outer class Constructor");
		
	}
	static {
		System.out.println("Outer class static block");
		
	}
	public void M1() {
		System.out.println("normal method inside OuterClass");
	}
	
	static class InnerClass {
		InnerClass() {
			System.out.println("inner class Constructor");
			
		}
		static {
			System.out.println("Inner class static block");
			
		}
		public void M2() {
			System.out.println("normal method inside innerClass");
		}
		public static void main(String[] args) {
			System.out.println("inner class");
			InnerClass iobj = new InnerClass();
			iobj.M2();
		}
	}
	public static void main(String[] args) {
		StaticInnerClass ob = new StaticInnerClass();
		ob.M1();
		
	}

}
