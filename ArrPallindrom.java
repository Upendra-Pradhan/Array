package Com.My_Package.Array;

import java.util.Arrays;

public class ArrPallindrom {
	private static void isPallin(char ch[]) {

		int st = 0;
		int end = ch.length - 1;

		while (st < end) {

			if (ch[st] != ch[end]) {

				System.out.println("Given character id not Pallindrom");
			}
			st++;
			end--;
		}
		System.out.println("Given character is Pallindrom");

	}

	public static void main(String[] args) {

		char ch[] = { 'M', 'A', 'D', 'A', 'M' };

		isPallin(ch);
	}

}
