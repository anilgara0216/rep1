package Pack1;
import java.util.*;

public class QueueClass {
	public void LinkedList() {
		//System.out.println("Implementing LinkedList in Queue Intreface");
		Queue<Object> ll = new LinkedList<>();
		ll.add(10);
		ll.offer("Anil"); 
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(20);
		ll.add(60);
		ll.add(20);
		ll.add(80);
		System.out.println(ll);
		System.out.println(ll.poll()); //it retrives the 1st element after removing it from the queue
		// the poll() returns null when the queue is empty
		
		System.out.println(ll);
		System.out.println(ll.remove()); //this will remove the 1st element in the queue
		//we will get exception when we use remove() if queue is empty
		
		System.out.println(ll);
		System.out.println(ll.remove(4)); //here if 4 is there in the queue then it removes and gives true
		//if 4 is not there inside the queue then it returns false
		//*** We can't remove the elements using index values when we use LinkedList in the Queue interface
		
		System.out.println(ll);
	}
	public void PriorityQueue() {
		System.out.println("Implementing PriorityQueue in Queue Intreface");
		
		PriorityQueue<Object> pq = new PriorityQueue<>();
		pq.add(10);
		//pq.offer("Anil"); //heterogeneous data is not allowed
		//pq.add(null); //null is not allowed
		pq.add(20);
		pq.add(1); //Duplicates are allowed
		pq.add(30); //available from java 1.5v
		pq.add(1); //Default capacity is 11
		pq.add(50); // it not synchronized by default
		pq.add(60);
		pq.add(70);
		System.out.println(pq);	
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println();
		
		for(Object o: pq) {
			System.out.print(o + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Implementing queue classes");
		System.out.println();
		//new QueueClass().LinkedList();
		new QueueClass().PriorityQueue();
		
		
	}

}
