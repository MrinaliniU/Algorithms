package ds;

public class Stack {
	private int maxsize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxsize = size;
		this.stackArray = new long[size];
		top = -1;
	}
	public void push(long j) {
		top++;
		try {
		stackArray[top] = j;
		}catch(ArrayIndexOutOfBoundsException e) {
			top--;
			System.out.println("The maximum size of the array is " + maxsize);
		}
	}
	public long pop() {
		long val = stackArray[top];
		top--;
		return val;
	}
	public long peak() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return(top == -1);
	}
	public boolean isFull() {
		return(maxsize-1 == top);
	}

}
