package Com.My_Package.Array;

class EvenIndex {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(i); // It will print the only index
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}
}