package Com.My_Package.Array;

import java.util.LinkedHashSet;

public class hashSet {
	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 20, 30, 30, 40 };
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		for (int i : a) {
			hashSet.add(i);

		}
		System.out.println(hashSet);
	}

}
