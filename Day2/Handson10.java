package com.ia.hand.foJ;

public class Handson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int co=1,j=2;
		

			for(int i=j;i<=1000;i++) {
				if(i%2==0 && i%3==0 && i%5==0) {
					j=i;
					System.out.print(i+", ");	
					co++;
				}
				
				if(co > 5)
				{
					break;
				}
				
			}
			
	}

}
