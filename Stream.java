package Com.My_Package.Array;

import java.util.Arrays;

public class Stream {
	public static void main(String[] args) {
		
		int a[]= {10,20,10,20,30,30,40};
		int[] b=Arrays.stream(a).distinct().toArray();
		
		System.out.println(Arrays.toString(b));

}
}
