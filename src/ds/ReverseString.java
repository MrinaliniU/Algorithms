package ds;

public class ReverseString {
	private int maxsize;
	private char[] c;
	String s;
	private int top;
	
	ReverseString(String s){
		this.top = -1;
		this.s = s;
		this.maxsize = s.length();
		this.c = new char[s.length()];
	}

	public void push(char c) {
		top++;
		this.c[top] = c;
	}
	public char pop() {
		char val =  c[top];
		top--;
		return val;
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		ReverseString rev = new ReverseString("Mrinalini");
		for(int i = 0;i<rev.maxsize;i++) {
			rev.push(rev.s.charAt(i));
		}
		while(!rev.isEmpty()) {
			char val = rev.pop();
			System.out.print(val);
		}
		

	}

}
