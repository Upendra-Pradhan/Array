package Com.My_Package.Array;

import java.util.Arrays;

public class Reverse2 {
	public static int[] Check(int a[]) {
		int st=0,end=a.length-1,temp;
		while(st<end) {
			temp=a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(Check(a)));
		
		
	}
	

}
