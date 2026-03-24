package Com.My_Package.Array;

public class Palindrome{
	public static String Palindrome(char ch []) {
		int st=0; int end=ch.length-1;
		while(st<end) {
			if(ch[st]!=ch[end]) {
				return "Given Character Array is not palindrome";
			}
			st++;
			end--;
			
				
		}
		return "Given Character Array is Pallindrome";
	}
	
//	Another Process
	
	public static boolean isPalindrom(char[] ch) {
		int st=0, end= ch.length-1;
		
		 while(st<end) {
			 
			 if(ch[st]!=ch[end]) {
				 
				 return false;
			 }
				 st++;
				 end--;
		   }
			 return true;
				 
		}
		
	
	public static void main(String[] args) {
		char [] ch= {'l','e','v','e','l'};
		//System.out.println(Palindrome(ch));
		System.out.println(isPalindrom(ch));
	}
	
}
