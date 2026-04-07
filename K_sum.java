package Com.My_Package.Array;

public class K_sum {

	public static void isPossible(int a[], int target) {

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			int sum = 0;

			for (int j = i; j < a.length; j++) {

				sum += a[j];

				if (sum > target)
					break;

				if (sum == target) {
					count++;
					System.out.println("Start: " + i + " End: " + j);
				}
			}
		}

		System.out.println("Total count: " + count);
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int target = 5;

		isPossible(a, target);
	}
}