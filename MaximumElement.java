package Com.My_Package.Array;

import java.util.Arrays;

public class MaximumElement {
	public static void Maximum(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
//		return max;
		System.out.println(max);
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		// System.out.println(Maximum(a));
		Maximum(a);
	}

}
