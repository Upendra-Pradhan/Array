package Com.My_Package.Array;

public class SumOfArr {

	public static void sumOfArray(int a[]) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		sumOfArray(a);
	}
}
