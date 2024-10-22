package assignment2.ques1;

import java.util.HashMap;

public class CompareStringService {
	
	/**
	 * Method is used to compare the String equalOrNot
	 * @param string1 
	 * @param string2
	 * @return compare both string and return boolean value
	 */
	public int equalsOrNot(String str1 , String str2) {
		
		int len1 = str1.length(); 
		int len2 = str2.length();
		
		if(len1 != len2) return 0; 
		
		for(int i=0; i<len1; i++) {
			
			if(str1.charAt(i) != str2.charAt(i)) {
				return 0; 
			}
		}
			
			
		return 1; 
	}
    
 
	/**
	 * Reverse the string
	 * @param str input string 
	 * @return reversed string 
	 */
	public String reverseString(String str) {

		
		int len = str.length(); 
		
		String res = "";
		
		for(int i=len-1; i>=0; i--) {
			res  = res + str.charAt(i); 
		}
		return res;
	}
	
	/**
	 * Convert the LowerCase String into the UpperCase and Vice versa
	 * @param str input string
	 * @return converted string lowerCase to upperCase and vice versa
	 */
	public String lowerCaseToUpperCase(String str) {
		
		int len = str.length();
		
		String ans ="";
		
		for(int i=0; i<len; i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' &&  ch <= 'z') {
				ch = (char) (ch - 'a' + 'A');
				ans += ch; 
			}
			else if(ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch - 'A' + 'a');
				ans += ch; 
			}
			else {
				ans += ch; 
			}
		}
		return ans; 
		
	}
	
	/**
	 * find the largest word in the String 
	 * @param str input string
	 * @return largest word in the string 
	 */
	public String largestWordInString(String str) {
		
		int len = str.length();
		
		 HashMap<Integer, String> freq = new HashMap<>();
		 
		 int count=0;
		 String ans =" ";
		
		 for(int i=0; i<len; i++) {
			
			 if(str.charAt(i) == ' ') {
				 
				 freq.put(count, ans);
				 count=0; 
				 ans=" ";
				 
			 }
			 else if(i == len-1) {
				 ans += str.charAt(i);
				 count++; 
				 freq.put(count, ans);
			 }
			 else {
				 
				 ans += str.charAt(i);
				 count++; 
			 }
		 }

		 int maxi = -1; 
		 
		 for(HashMap.Entry<Integer, String> it : freq.entrySet()){
            	 
			 if(it.getKey() > maxi) {
				 maxi = it.getKey();
				 
			 }
			 
             }
		 
		 return freq.get(maxi);
		
	}
}

