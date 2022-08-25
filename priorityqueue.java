package list;
import java.util.*;
public class priorityqueue {
public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	for(int i=1;i<10;i++) {
		System.out.print(i+ " ");
		pq.add(i);
	}
	System.out.println();
	System.out.println(pq.peek());//  will give 1st element or the top element//1
	
	System.out.println(pq.poll());// will remove and will show the top element
	
	System.out.println(pq);
	System.out.println(pq.contains(11));	
	
	pq.offer(10);// acts similar to the method add on
	System.out.println(pq);
	
	
	System.out.println(pq.hashCode());// prints the code for hashkey
	
}
}
