import java.util.Scanner;

public class UpLowCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character value");
		char c = sc.next().charAt(0);
		
		if(Character.isUpperCase(c)) 
			System.out.println(Character.toLowerCase(c));
			
		else
			System.out.println(Character.toUpperCase(c));

	}

}
