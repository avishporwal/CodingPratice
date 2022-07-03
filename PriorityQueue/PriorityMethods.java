package PriorityQueue;


public class PriorityMethods {

	public Node head;
	
	class Node{
		String data;
		int priority;
		Node next;
	}
	
	public Node newNode(String d, int p) {
		Node temp = new Node();
		temp.data = d;
		temp.priority = p;
		return temp;
		
	}
	

	public void take() {
		if(head!=null) {
		System.out.println(head.data);
		head = head.next;
		}
		else {
			System.out.println("Queue is empty");
		}
	}
	

	public void offer(String d, int p) {

		if(head == null) {
			Node node = newNode(d, p);
			head = node;
		}
		else {
			Node start = head;
			Node temp = newNode(d, p);
			if(start.priority < temp.priority ) {
				temp.next = head;
				head = temp;
			}
			else {
				while(start.next !=null && start.next.priority >= temp.priority) {
					start = start.next;
				}	
				temp.next = start.next;
				start.next = temp;
			}
			}
	}
		


}