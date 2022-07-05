package PriorityQueue;


public class PriorityQueue extends PriorityMethods<Object> {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.offer("Software Engineering",0);   

		pq.offer(45,1);
	
		pq.offer("Welcome",0);
		
		pq.offer(74.6,1);
		
		pq.offer('t',2);
		
		pq.offer("!", 1);
		
		
		pq.take();
		pq.take();
		pq.take();
		pq.take();
		pq.take();
		pq.take();
		
		
		
		
	}

}