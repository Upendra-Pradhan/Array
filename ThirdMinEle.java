	package Com.My_Package.Array;

public class ThirdMinEle {
	
		public static int  ThirdMin(int a[]) {
			
			int min1= Integer.MAX_VALUE;
			int min2= Integer.MAX_VALUE;
			int min3=Integer.MAX_VALUE;
			
			for(int i=0;i<a.length;i++) {
				
				if(a[i]<min1) {
					
					min3=min2;
					min2=min1;
					min1=a[i];
				}
				else if	(a[i]<min2 && a[i]!=min1) {
					min3=min2;
					min2=a[i];
					
			}
				else if(a[i]<min3 && a[i]!=min2 && a[i]!= min1) {
					min3=a[i];
				}
			}
			return min3;
			
		}
		public static void main(String[] args) {
			int a[]= {10,20,15,18,10,30,15,40,50};
			//System.out.println(Arrays.toString(Maximum(a)));
			System.out.println(ThirdMin(a));
		}


	}


