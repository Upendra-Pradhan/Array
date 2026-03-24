package Com.My_Package.Array;

import java.util.Arrays;

public class Insertion {
	public static int[] Check(int a[]) {
	    int a2[] = new int[a.length + 1];
	    int ele = 30;
	    int ind = 2;

	    // copy before index
	    for(int i = 0; i < ind; i++) {
	        a2[i] = a[i];
	    }

	    // insert element
	    a2[ind] = ele;

	    // copy remaining elements
	    for(int i = ind; i < a.length; i++) {
	        a2[i + 1] = a[i];
	    }

	    return a2;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,40,50};
		System.out.println(Arrays.toString(Check(arr)));	}

}
