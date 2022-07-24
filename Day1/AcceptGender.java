import java.util.Scanner;

public class AcceptGender {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Gender ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter age ");
		int age = sc.nextInt();
		
		if(s1.equals("Female")) {
			
			if(age >=1 && age<=58)
				System.out.println(" percentage of interest is 8.2%.");
			
			else if(age >=59 && age<=100)
				System.out.println(" percentage of interest is 9.2%.");
			
			else
				System.out.println("Invalid age for female");
			
		}
		
		else {
			if(age >=1 && age<=58)
				System.out.println(" percentage of interest is 8.4%.");
			
			else if(age >=59 && age<=100)
				System.out.println(" percentage of interest is 10.5%.");
			
			else
				System.out.println("Invalid age for male");
			
		}

	}

}
