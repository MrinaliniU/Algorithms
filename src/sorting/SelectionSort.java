package sorting;

public class SelectionSort {
	public static int[] mySelectionSort(int[] a) {
		for(int i = 0;i< a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[i]) {
					int least = a[i];
					a[i] = a[j];
					a[j] = least;
				}
			}
		}
		return a;
		
	}
	
	public static int[] selectionSort(int[] a) {
		for(int i = 0;i< a.length; i++) {
			int minimum = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[minimum]) {
					minimum = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		int[] a = {5,1,11,36,2,45,40,90};
		int[] ans = mySelectionSort(a);
		for(int i = 0;i< a.length; i++) {
		System.out.println(ans[i]);
		
	}

}
}
