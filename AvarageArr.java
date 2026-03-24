package Com.My_Package.Array;

public class AvarageArr {
	public static float Avg(int a[]) {
		
		int sum=0;
		float avg=0;
		int len=a.length;
		
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
		}
		avg=(float)sum/len;
		return avg;
	}
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		
		System.out.println(Avg(a));
	}
	

}
