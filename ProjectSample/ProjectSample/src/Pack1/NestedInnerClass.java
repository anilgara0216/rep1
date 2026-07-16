package Pack1;

class NestedInnerClass {
	private void M1() {
		System.out.println("Hiii I'm from Outer Class method");
		System.out.println("We can access this private method using innerClass");
	}
	NestedInnerClass() {
		System.out.println("I'm a Constructor from OuterClass");
	}
	class InnerClass {
		public void M2() {
			System.out.println("Hello I'm from InnerClass Method");
			M1();
		}
		InnerClass() {
			System.out.println("hlooo I'm a Constructor from InnerClass ");
		}
	}
	public static void main(String[] args) {
		NestedInnerClass.InnerClass obj = new NestedInnerClass().new InnerClass();//If we want to call the methods inside innerClass
		obj.M2();
	}
}
