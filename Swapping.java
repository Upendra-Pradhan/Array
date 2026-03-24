package Com.My_Package.Array;

import java.util.Arrays;

public class Swapping {
	
	public static int[] Swapping(int a[]) {
		int temp;
		int st=0;
		int end=a.length-1;
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
		int [] a= {10,20,30,40,50};
		System.out.println(Arrays.toString(Swapping(a)));
		
}
	}
