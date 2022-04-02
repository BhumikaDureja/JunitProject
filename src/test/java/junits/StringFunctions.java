package junits;

public class StringFunctions {
	
	public static boolean isPalindrome(String Str) {
	
		//Str = madam;
		
		int start = 0;
		int end = Str.length()-1;
		
		while (start<end)
		{
			if (Str.charAt(start) != Str.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}

}
