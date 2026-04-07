package Com.My_Package.Array;

import java.util.Arrays;

public class SelectionSort {

	public static int[] isSelection(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			int ind = i; // index of minimum element

			for (int j = i + 1; j < a.length; j++) {

				if (a[ind] > a[j]) {

					ind = j;
				}
			}

			if (i != ind) {

				int temp = a[i];
				a[i] = a[ind];
				a[ind] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 13, 17, 3, 2 };
		System.out.println(Arrays.toString(isSelection(a)));
	}
}
