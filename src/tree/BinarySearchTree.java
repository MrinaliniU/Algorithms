package tree;

public class BinarySearchTree {
	private Node root;
	
	public void insert(int key, String value) {
		Node newNode = new Node(key, value);
		Node currentNode;
		if(root == null) {
			root = newNode;
		}else {
			currentNode = root;
			Node parent = null;
			while(currentNode !=null) {
				parent = currentNode;
				if(key <= currentNode.key) {
					currentNode = currentNode.leftChild;
				}else {
					currentNode = currentNode.rightChild;
				}
			}
			if(key <= parent.key) {
				parent.leftChild = newNode;
			}else {
				parent.rightChild = newNode;
			}
			
		}
	}
	
	public Node findMin() {
		Node parent = root;
		Node current = parent;
		while(current != null) {
			current = current.leftChild;
			if(current != null)
			parent = current;
		}
		return parent;
	}
	
	public Node findMax() {
		Node parent = root;
		Node current = parent;
		while(current != null) {
			current = current.rightChild;
			if(current != null)
			parent = current;
		}
		return parent;
	}

}
