package tree;

public class App {

	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(16, "Sixty Three");
		b.insert(11, "Twenty");
		b.insert(30, "Thirteen");
		b.insert(8, "Twenty One");
		b.insert(17, "Ninty Three");
		b.insert(19, "Hundred");
		b.insert(42, "Hundred");
		System.out.println(b.findMin().key);
		System.out.println(b.findMax().key);
	}
}
