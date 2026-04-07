package Com.My_Package.Array;

import java.util.Arrays;

public class MurgeArr {

	public static int[] mergearr(int a[], int b[], int c[]) {

		int j = 0;

		for (int i = 0; i < c.length; i++) {

			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[j++];

		}
		return c;

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 30, 40, 50 };
		int c[] = new int[a.length + b.length];

		System.out.println(Arrays.toString(mergearr(a, b, c)));
	}
}
