package Com.My_Package.Array;

public class SecondMaxEle2 {
	public static int SecondMax(int a[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2 && a[i] != max1) {
				max2 = max1;
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		int a[] = { 12, 34, 5, 65, 6, 6, 43, 433, };
		System.out.println(SecondMax(a));

	}

}
