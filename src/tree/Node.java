package tree;

public class Node {
	
	public Node(int key, String value) {
		super();
		this.key = key;
		Value = value;
	}
	int key;
	String Value;
	Node leftChild, rightChild;

}
