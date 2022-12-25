package Week3.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
        if(text1.length()==text2.length()) {
        	char[] ch = text1.toCharArray();
        	char[] ch1 = text2.toCharArray();
        	int count=0;
        	Arrays.sort(ch);
        	Arrays.sort(ch1);
        	System.out.println(ch);
        	System.out.println(ch1);
        	for(int i=0;i<text1.length();i++) {
        		if(ch[i]==ch1[i]) {
        			
        		}
        		else {
            		count++;

        		}
        		if(count>0) {
            		
            		System.out.println("not anagram");
            	}
            	else {
            		System.out.println("Anagram");
            	}
    	
    	
    }
     
            			
        		}
            		
        }

        	
	}


