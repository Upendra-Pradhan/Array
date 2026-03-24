package Com.My_Package.Array;

public class Accurence {
public static void main(String[] args) {
	int a[]= {10,20,10,20,30,40,30};
	
	for(int i=0;i<a.length;i++) {
		
	int	count=1;
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i] == a[j]) {
				a[j]=Integer.MAX_VALUE;
				count++;
				}
			}
		
		if(count>=1 && a[i]!=Integer.MAX_VALUE)
			System.out.println(a[i]+"------>>>"+count);
			
	    }
	}
}
	

