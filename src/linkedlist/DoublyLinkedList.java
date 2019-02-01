package linkedlist;

public class DoublyLinkedList {

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
		if(first != null) {
			first.previous = newNode;
		}
		first = newNode;
	}
	
	public void display() {
		System.out.print("{");
		Node current = first;
		while(current.next !=null) {
			current.displayNode();
			current = current.next;
		}
		current.displayNode();
		System.out.print("}");
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(last != null) {
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
		}else {
			insertFirst(data);
		}
		
	}
	
	public void insertBefore(int key, int data) {
		Node newNode = new Node();
		newNode.data = data;
		Node current = first;
		while(current != null) {
			if(current.data == key) {
				newNode.next = current;
				if(current.previous != null) {
					current.previous.next = newNode;
					newNode.previous = current.previous;
				}else {
					insertFirst(data);
				}
			}
			current = current.next;
		}
	}
	
	public void insertAfter(int key, int data) {
		Node newNode = new Node();
		newNode.data = data;
		Node current = first;
		while(current != null) {
			if(current.data == key) {
				newNode.previous = current;
				if(current.next != null) {
					insertBefore(current.next.data, data);
				}else {
					insertLast(data);
				}
				
			}
			current = current.next;
		}
	}
}
