package Com.My_Package.Array;

public class MinimumElement {
	
	public static int  Check(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
  public static void main(String[] args) {
	int a[]= {5,10,20,30,40,50};
	int min=a[0];
	
  for(int i=0;i<a.length;i++) {
	  if(a[i]<min) {
		  min=a[i];
	  }
	  
  }
  System.out.println(""+min);
  System.out.println(Check(a));


  }
  }
