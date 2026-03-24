package Com.My_Package.Array;
import java.util.Arrays;

public class zigzagArray{
	
 public  static int[] zigzag(int a[],int b[],int c[]) {
	 int i=0,j=0,k=0;
	 
	 while(i<c.length) {
		 
		 if(j<a.length) {
			 
			 c[i++]=a[j++];
		 }
		 if(k<b.length) {
			 
			 c[i++]=b[k++];
		 }
		 
	 }
	 return c;
 }
 public static void main(String[] args) {
	 
	int a []= {10,30,50};
	int b[]= {20,40};
	
	int c[]=new int[a.length+b.length];
	
	 System.out.println(Arrays.toString(zigzag(a, b, c)));
}
	 
 }
