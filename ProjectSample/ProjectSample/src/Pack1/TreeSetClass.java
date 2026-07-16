package Pack1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		System.out.println("Implementing the TreeSet...");
		TreeSet<Object> ts = new TreeSet<>();
		ts.add(10); //Insertion order not maintained (it will maintain ascending order)
		//ts.add(null); //null is not allowed
		//ts.add("Anil"); //heterogeneous data is not allowed
		ts.add(20); //remaining all are same as hashSet
		ts.add(90);
		ts.add(60);
		ts.add(20);
		ts.add(40);
		System.out.println(ts);
		System.out.println();
		System.out.println("descendingIterator() → available in LinkedList, TreeSet, TreeMap");
		Iterator<Object> it = ts.descendingIterator(); //same like Iterator but iterated in reverse
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("these below 2 methods supports only in Treeset and TreeMap");
		System.out.println(ts.headSet(20)); //returns all the values which are less than given value
		System.out.println(ts.tailSet(20)); //returns all the values which are >=  given value
	}
	

}
