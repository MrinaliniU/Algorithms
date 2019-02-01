package linkedlist;

public class App2 {
	
	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		CircularLinkedList c = new CircularLinkedList();
		DoublyLinkedList d = new DoublyLinkedList();
		d.insertLast(10);
		d.insertLast(20);
		d.insertLast(30);
		d.insertLast(40);
		d.insertAfter(10, 3000);
		d.display();
	}

}
