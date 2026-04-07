package Com.My_Package.Array;

import java.util.Arrays;

public class Reverse {

	public static int[] Reverse(int[] a) {
		int b[] = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(Reverse(a)));
	}

}
