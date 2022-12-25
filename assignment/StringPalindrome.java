package Week3.assignment;

public class StringPalindrome {
	
	public static void main(String[] args) {

		String stt="madam"; 
		String rev="";
		

		for(int i=stt.length()-1;i>=0;i--) {

	        rev=rev+stt.charAt(i);
		}
		System.out.println("reverse word: " +rev);
		if(stt.equals(rev)) {
			System.out.println("the given string is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

		
		
		
		
		
		
}
}