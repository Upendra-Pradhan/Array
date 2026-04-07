package Com.My_Package.Array;

import java.util.Arrays;

public class BubbleSort {
	public static int[] isSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 1, 17, 3, 2 };
		System.out.println(Arrays.toString(isSort(a)));
	}

}
