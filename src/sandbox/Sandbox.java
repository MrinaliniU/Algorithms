package sandbox;


import java.util.*;

public class Sandbox {
	
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		int jump = 0;
		for(int i = 0;i< c.length; i++) {
			if(i+2 <= c.length -1) {
			if(c[i+1] == 0 && c[i+2] == 1) {
				count++;
				jump = i+1;
			}else if(c[i+1] == 1 && c[i+2] == 0) {
				count++;
				jump = i+2;
				i = i+1;
			}else if(c[i+1] == 0 && c[i+2] == 0) {
				count++;
				jump = i+2;
				i = i+1;
			}
			}
		}
		if(jump == c.length - 2 && c[c.length - 1] == 0) {
			count++;
		}
		return count;

    }
	
	public static void main(String[] args) {	
		int[] a = {0,0,0,1,0,0};
		int ans = jumpingOnClouds(a);
			System.out.print(ans);
		
	}
	
	
}
	