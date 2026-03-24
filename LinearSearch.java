package Com.My_Package.Array;

public class LinearSearch {
	public static String test(int a[],int ele)
	{
		int st=0,end=a.length-1;
		for (int i=0;i<a.length ;i++ ) 
		{
			if(ele==a[i])
				return "element found at "+i;
			
		}
		return "element not found";
	}
	public static void main(String[] args) {
		int[]arr={10,20,30,40,50};
		int ele=20;
		System.out.println(test(arr,ele));
	}


}
