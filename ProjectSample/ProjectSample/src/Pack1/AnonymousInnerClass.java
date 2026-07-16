package Pack1;

public class AnonymousInnerClass {
	
	static ClassB bob = new ClassB() {
		public void Show() {
			super.Show(); //this will prints the method of outer/parent class
			System.out.println("method present in the anonymous inner class");
		}
		
	};
	public static void main(String[] args) {
		bob.Show(); // show() present in the anonymous class will be executed because when we use anonymous inner class that extends ClassB and overrides its Show() method.
	}

}
