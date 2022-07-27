package com.ia.hand.eighteenJu;

/*
Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and
getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate
that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.
The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and
KotMBank - Savings 6% Fixed 9%.
Create a main method to test the above classes and their methods. Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();
b) KotMBank k=new KotMBank();
c) GeneralBank g=new KotMBank();
d) GeneralBank g=new ICICIBank();
*/

abstract class GeneralBank{
	
	 abstract double getSavingsInterestRate();	
	 abstract double getFixedDepositInterestRate();
	
}

class ICICIBank extends GeneralBank{
	double getSavingsInterestRate() {		
		return 4;
	}
		
	double getFixedDepositInterestRate() {
		 return 8.5;
	}
}

class KotMBank extends GeneralBank{
	double getSavingsInterestRate() {		
			return 6;
		}
			
	double getFixedDepositInterestRate() {
			 return 9;
		}
}


public class H12 {
	public static void main(String[] args) {
		
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		
		System.out.println("ICICI Bank : ");
		System.out.println("Saving account intrest rate - "+i.getSavingsInterestRate()+"%");
		System.out.println("fixed deposit account interest rate - "+i.getFixedDepositInterestRate()+"%");
		
		System.out.println("\nKotat Bank : ");
		System.out.println("Saving account intrest rate - "+k.getSavingsInterestRate()+"%");
		System.out.println("fixed deposit account interest rate - "+k.getFixedDepositInterestRate()+"%");

		System.out.println("-----------------------------------------");
		GeneralBank g=new KotMBank();
		GeneralBank g1=new ICICIBank();
		
		System.out.println("ICICI Bank : ");
		System.out.println("Saving account intrest rate - "+g1.getSavingsInterestRate()+"%");
		System.out.println("fixed deposit account interest rate - "+g1.getFixedDepositInterestRate()+"%");
		
		System.out.println("\nKotat Bank : ");
		System.out.println("Saving account intrest rate - "+g.getSavingsInterestRate()+"%");
		System.out.println("fixed deposit account interest rate - "+g.getFixedDepositInterestRate()+"%");

		
	}
}



