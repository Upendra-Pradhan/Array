package Com.My_Package.Array;

public class SecondMin {
	public static int SecondMinEle(int a[]) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min1) {
				min2 = min1;
				min1 = a[i];

			} else if (a[i] < min2 && a[i] != min1) {
				min2 = a[i];
			}
		}
		return min2;

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(SecondMinEle(a));
	}

}
