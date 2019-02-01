package linkedlist;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		if(newNode.next == null) {
			newNode.next = last;
			last = newNode;
		}
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(!isEmpty()) {
			last.next = newNode;
			last = newNode;
		}else {
			insertFirst(data);
		}
	}
	
	public void display() {
		System.out.print("[");
		Node current = first;
		while(current.next !=null) {
			current.displayNode();
			current = current.next;
		}
		current.displayNode();
		System.out.print("]");
	}

}
