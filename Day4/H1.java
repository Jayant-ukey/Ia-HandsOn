//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
		char c[] = s1.toCharArray();
		int i=0,count=0;
		int j=s1.length()-1;
		
		while(i<s1.length()/2) {
			
			if(c[i] != c[j]) {
				System.out.println("Not Palindrome");
				count=1;
				break;
			}
			
			i++;
			j--;
		}
		
		if(count==0)
			System.out.println("Palindrome");
		
	}

}
