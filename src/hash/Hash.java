package hash;

public class Hash {
	
	String[] hashArray;
	int arraySize,currentSize;
	public Hash(int arraySize) {
		super();
		if(!isPrime(arraySize)) {
			this.arraySize = findNextPrime(arraySize);
			hashArray = new String[this.arraySize];
			System.out.println("new size " + this.arraySize);
		}else {
			hashArray = new String[arraySize];
			this.arraySize = arraySize;
		}
		
	}
	
	private int findNextPrime(int arraySize2) {
		while(!isPrime(arraySize2)) {
			arraySize2+= 1;
		}
		return arraySize2;
	}

	private boolean isPrime(int arraySize2) {
		for(int i = 2; i*i <= arraySize2; i++) {
			if(arraySize2 % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean inserString(String word) {
		if(currentSize == arraySize) {
			System.out.println("Array is Full");
			return false;
		}
		int index = findIndex(word);
		int stepSize = findStep(index);
		while(hashArray[index] != null) {
			index = index + stepSize;
			index = index % arraySize;
		}
		hashArray[index] = word;
		currentSize++;
		return true;
	}

	private int findStep(int index) {
		// TODO Auto-generated method stub
		return 3 - index % 3;
	}

	private int findIndex(String word) {
		int index = word.hashCode();
		index = index % arraySize;
		if(index < 0) {
			index = index + arraySize;
		}
		return index;
	}
	
	public void displayHash() {
		for(int i =0;i< hashArray.length; i++) {
			if(hashArray[i] != null)
			System.out.print(hashArray[i] + " ");
			else System.out.print(" *** ");
		}
	}
	
	public int find(String word) {
		int index = findIndex(word);
		int step = findStep(index);
		int searched = 0;
			while(hashArray[index] != null && searched < arraySize) {
				if(hashArray[index].equals(word)) {
					return index;
				}
				index = index + step;
				index = index % arraySize;
				searched++;
			}
			return 0;
		}
		
	}
