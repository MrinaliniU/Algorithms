package sorting;

public class InsertionSort {
	
	public static int[] myInsertionSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int x = i, j = i +1;
			while(j > 0 && j < a.length) {
				if(a[j] < a[x]) {
					int temp = a[x];
					a[x] = a[j];
					a[j] = temp;
				}
				j--;
				x--;
			}
		}
		return a;
	}
	
	public static int[] insertionSort(int[] a) {
		for(int i = 1; i< a.length; i++) {
			int element = a[i];
			int j = i-1;
			while(j>=0 && a[j]>element) {
				a[j+1] =a[j];
				j--;
			}
			a[j+1] = element;
 		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[] = {5,11,2,0,1,30,6,3};
		int[] ans = insertionSort(a);
		for(int i = 0; i< a.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
