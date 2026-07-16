package Pack1;
import java.util.*;

public class TreeMapClass {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(101, "Anil"); //Ascending order is not maintained
		tm.put(100, "Anil");  
		tm.put(107, null); //null key is not allowed but null value is allowed
		tm.put(101, "Polisu"); //duplicate keys are not allowed 
		//Duplicate Values are allowed but when we use duplicate key old value is replaced with new value for that duplicate key
		//tm.put("Madhuri", 10); // heterogeneous keys are not allowed
		tm.put(103, "is"); //heterogeneous values are allowed
		tm.put(105, "Awesome"); //it is available from java 1.2v
		tm.put(110, "gara"); //Default capacity is 16
		tm.put(102, 20000); //It is not synchronized
		tm.put(100, "Gowri");

		System.out.println(tm);
		tm.put(101, "Raju");
		System.out.println();
		System.out.println(tm);

	}

}
