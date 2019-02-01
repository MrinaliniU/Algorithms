package hash;

public class App {
	
	public static void main(String[] args) {
		Hash h = new Hash(10);
		h.inserString("Polow");
		h.inserString("poill");
		h.inserString("witch");
		h.inserString("pulla");
		h.inserString("witch");
		h.inserString("kolo");
		h.inserString("witch");
		h.inserString("witch");
		h.displayHash();
		System.out.println(h.find("poihkjhjbll"));
	}

}
