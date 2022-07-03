package PriorityQueue;


public class PriorityQueue extends PriorityMethods {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.offer("Software Engineering",0);   

		pq.offer("World",1);
	
		pq.offer("Welcome",0);
		
		pq.offer("to",1);
		
		pq.offer("Here",2);
		
		pq.offer("!", 1);
		
		
		pq.take();
		pq.take();
		pq.take();
		pq.take();
		pq.take();
		pq.take();
		
		
		
	}

}