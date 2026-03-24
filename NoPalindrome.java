package Com.My_Package.Array;

public class NoPalindrome {
	public static void Check(int a[]) {
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			int last=0;
			int temp=a[i];
			while(n>0) {
				int rem=n%10;
				last=last*10;
				n=n/10;
				
			}
			if(temp==last)
				System.out.println("The element are palindrome:"+temp);
			else
				System.out.println("The element are not palindrome:"+temp);
		}
	}
	public static void main(String[] args) {
		int arr[]= {767,6788,5643,888,787};   //{6788,5643}
		Check(arr);
	}

}
