package search;

public class LinearSearch {
	public static int linearSearch(int[] a, int x) {
		int ans = -1;
		for(int i = 0;i < a.length; i ++) {
			if(a[i] == x) {
				return i;
			}
		}
		return ans;
	}
	
	public static int recursiveLinearSearch(int[] a, int len, int target) {
		if(len == -1) {
			return -1;
		}else if(a[len] == target) {
			return len;
		}else {
			return recursiveLinearSearch(a, len - 1, target);
		}
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80};
		int x = 10;
		int ans = recursiveLinearSearch(a, a.length - 1, x);
		System.out.println("The index of " + x + " is " + ans);
	}
}
