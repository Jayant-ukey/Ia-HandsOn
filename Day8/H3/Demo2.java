
/*
	 i) Create the following class and implement the method to check whether the given
	string is a palindrome and return the result.
	Class Name : Demo2
	Method : palindromeCheck(String):boolean
	
	(Hint: A String is palindrome, If the reversed string is equal to the actual string.
	 Ex: madam, mom, dad, malayalam )
	
	ii) Create a Junit test class to test the above class.
*/

public class Demo2 {

	boolean palindromeCheck(String s) {
		
		int i = s.length();
		int j=0;
		boolean flag=true;
		char s1[] = s.toCharArray();
		
		while(j < i/2) {
			
			if(s1[j] != s1[i-1]) {
				flag = false;
				break;
			}
			
			j++;
			i--;
		}
		
		return flag;
		
	}
}
