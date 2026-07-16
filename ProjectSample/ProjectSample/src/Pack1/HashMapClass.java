package Pack1;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapClass {
	public static void main(String[] args) {
		System.out.println("Implementing HashMap");
		
		LinkedHashMap hm = new LinkedHashMap(); //here insertion order is maintained & it is available from java 1.4v rest all are same as HashMap 
		
		//HashMap hm = new HashMap();
		hm.put(100, "Anil"); //Insertion order is not maintained
		hm.put(null, null); //null is allowed
		hm.put(101, "Polisu"); //duplicate keys are not allowed 
		//Duplicate Values are allowed but old value is replaced with new value for that duplicate key
		hm.put("Madhuri", 10); // heterogeneous key are allowed
		hm.put(103, "is"); //heterogeneous values are allowed
		hm.put(105, "Awesome"); //it is available from java 1.2v
		hm.put(110, "gara"); //
		hm.put(102, 20000);
		hm.put(100, "Gowri");
		System.out.println(hm);
		hm.put(101, "Raju");
		
		System.out.println(hm);
		System.out.println();
		
		System.out.println("For getting only the keys........");
		HashSet hs = new HashSet(hm.keySet()); //keySet() will return/print the all available keys inside a map
		System.out.println(hs);
		System.out.println();
		
		System.out.println("For getting only the values.......");
		HashSet hs2 = new HashSet(hm.values()); 
		System.out.println(hs2);
		System.out.println();
		
		System.out.println("For getting the key-value pairs....");
		HashSet hs3 = new HashSet(hm.entrySet());
		Iterator it = hs3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //For getting the key-value pairs
			//Entry e = (Entry)it.next();
			//System.out.println(e.getKey()+ " "+e.getValue()); //For getting the key-value pairs separately
		}
		System.out.println();
		
	}

}
