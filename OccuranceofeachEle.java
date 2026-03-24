
package Com.My_Package.Array;

public class OccuranceofeachEle {
	public static void main(String[] args) {
		int a[]= {10,10,10,20,20,30,40,50,30,60,40,02,03,1};
		for(int i=0;i<a.length;i++) {
			if(a[i]==Integer.MAX_VALUE)
				continue;
			int count=0;
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					a[j]=Integer.MAX_VALUE;
					count++;
					
				}
			}
				System.out.println(a[i]+" "+"-->"+count);
			}
		}
	}


