package linkedlist;

public class App {

	public static void main(String[] args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		//assign data
		n1.data = 9;
		n2.data = 10;
		n3.data = 11;
		n4.data = 12;
		//link list
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
	 System.out.println(getLength(n1));
	}
	public static int getLength(Node n) {
		int len = 1;
		Node temp = n;
		while(temp.next!=null) {
			len++;
			temp = temp.next;
		}
		return len;
	}
}
