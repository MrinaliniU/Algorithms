package search;

public class BinarySearch {
	
	public static int findInt(int[] a, int x) {
		int ans = -1;
		int i_p = 0,i_r = a.length ,i_q = (i_p + i_r)/2;
		while(i_p <= i_r) {
		if(a[i_q] == x) {
			ans = i_q;
			return i_q;
		}else if(a[i_q] < x) {
			i_p = i_q + 1;
		}else if(a[i_q] > x) {
			i_r = i_q - 1;
		}
		i_q = (i_p + i_r)/2;
		}
		return ans;
	}

	public static int recursiveBinarySearch(int[] a, int p, int q, int target) {
		int i = (p + q)/2;
		if(p > q) {
			return -1;
		}
		if(a[i] == target) {
			return i;
		}else {
			if(a[i] > target) {
				q = i - 1;
			}else{
				p = i + 1;
				}
			return recursiveBinarySearch(a, p, q, target);
		}
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90};
		int x = 50;
		//int ans = findInt(a, x);
		int ans = recursiveBinarySearch(a,0,a.length -1, x);
		System.out.println("The index of " + x + " is " + ans);
	}

}
