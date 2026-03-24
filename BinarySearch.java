package Com.My_Package.Array;

public class BinarySearch {
	public  static String Check(int a[],int ele) {
		int st=0, end=a.length-1;
		
		while(st<=end) {
			int mid=(st+end)/2;
			if(ele==a[mid])
				return "element found at: "+ mid;
			else if(ele>a[mid])
				 st=mid+1;
			else if(ele<a[mid])
				end=mid-1;
		}
		return "element not found";
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int ele=40;
		System.out.println(Check(arr,ele));
	}

}
