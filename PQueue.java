package f;

import java.util.PriorityQueue;



public class PQueue {

	public static void main(String[] args) {
		
		
		
		PriorityQueue<Prio> pq = new PriorityQueue<>(new PrioComparator());
		
		Prio p1 = new Prio("!",0);	
		Prio p2 = new Prio("love",5);   
		Prio p3  = new Prio("my",1);
		Prio p4 =  new Prio("I",8);
		Prio p5 = new Prio("country",1);
		
		pq.offer(p1);
		pq.offer(p2);
		pq.offer(p3);
		pq.offer(p4);
		pq.offer(p5);
		
		while(!pq.isEmpty()) {
		 System.out.println(pq.poll());	
		}

	}

}
