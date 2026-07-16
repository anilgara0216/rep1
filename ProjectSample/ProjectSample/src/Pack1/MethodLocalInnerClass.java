package Pack1;

public class MethodLocalInnerClass {
	public void M1() {
		class Inner {
			public void M2() {
				System.out.println("Method inside the MethodLocalInnerClass ");
			}
		}
		Inner in = new Inner();
		in.M2();
		
	}
	public static void main(String[] args) {
		MethodLocalInnerClass mobj = new MethodLocalInnerClass();
		mobj.M1();
	} 

}

//-->We have to create object for the innerClass if we want to access the methods inside the Innerclass
//-->we have to create objects for inner and outer classes for then only that methodlocalInnerClass will start execute(because methodlocalInnerClass is present inside the method so if we want to access methodlocalInnerClass then we need to call that particular method for that we have to create object for the outerClass then if we want to access methodlocalInnerClass so we need to create object for that methodlocalInnerClass, so totally 2 objects we need to create)
//-->We can't create object for the methodlocalInnerClass outside the method(compilor treats methodlocalInnerClass like a local varible)
