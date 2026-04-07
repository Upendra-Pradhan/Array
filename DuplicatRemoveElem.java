package Com.My_Package.Array;

import java.util.Arrays;

public class DuplicatRemoveElem {

	public static int[] Remove(int a[]) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != Integer.MAX_VALUE) {
					count++;
					a[j] = Integer.MAX_VALUE;
				}
			}
		}
		int[] b = new int[a.length - count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MAX_VALUE) {
				b[j++] = a[i];
			}

		}
		return b;

	}

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 20, 10, 20, 30, 30, 40 };
		System.out.println(Arrays.toString(Remove(a)));
		// System.out.println(Remove(a));
	}

}
