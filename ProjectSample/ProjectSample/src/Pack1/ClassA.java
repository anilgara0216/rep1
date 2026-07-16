package Pack1;

import java.util.*;
class ClassA {
    public static void main(String args[]) {
        System.out.println("........Implementing HashSet.......");
        System.out.println();
        HashSetClass<Object> ll = new HashSetClass<>();
        
        ll.add(10); // it won't follows the insertion order
        ll.add(10); // duplicates are not allowed
        ll.add("Anil"); // heterogenious data is allowed
        ll.add(null); //null is allowed
        ll.add(78); //hashSet  is available from java 1.2v 
        ll.add(45); //Default capacity is 16 & this size will be increased by double
        ll.add(88);// it is not synchronized by default
        System.out.println(ll);
        System.out.println();
        /*
        System.out.println("-------USing for loop-------");
        for(int i=0; i<ll.size();i++) {
            System.out.println(ll.get(i));
        }
        
        System.out.println("----Using for each loop-----");
        for(Object o: ll) {
            System.out.println(o);
        }
        System.out.println("-----Using Iterator Interface------");
        Iterator<Object> it = ll.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        /*
        System.out.println("______Using ListIterator_______");
        ListIterator l = ll.listIterator();
        while(l.hasNext()) {
        	System.out.println(l.next());
        }
        
        
       System.out.println();
       System.out.println("to retrieve the elements in reverse printing we use hasprevious() & previous");
       
       while(l.hasPrevious()) {
    	   System.out.println(l.previous());
       }
        */
        System.out.println("---we can't use Enumerator Interface-----");

        
    }
    
}
