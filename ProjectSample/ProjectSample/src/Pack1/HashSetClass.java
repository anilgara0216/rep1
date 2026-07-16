package Pack1;
import java.util.*;

public class HashSetClass {
	public static void main(String[] args) {
		System.out.println("Implementing HashSet and LinkedHashSet......");
		//LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		//for Linked HashSet all are same
		// but insertion order is maintained in the LinikedHaslhset & it is available from java 1.4v
		
		HashSet<Object> hs = new HashSet<>();
		hs.add("Anil"); //insertion order is not maintained
		hs.add(20); //Heterogeneous data is allowed 
		hs.add(30); //Duplicates data is not allowed 
		hs.add(null); //null is allowed
		hs.add(10); //it is available from java 1.2v
		hs.add(10); //it is not synchronized by default
		hs.add(70); 
		//default capacity is 16
		//( upto 12th element size won't increase after entering 13th element size will be increased to 32 means double)
		hs.add(80);
		hs.add(90);
		hs.add(100);
		System.out.println(hs);
		
		System.out.println("by using Iterator");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
