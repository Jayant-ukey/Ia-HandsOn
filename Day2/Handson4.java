package com.ia.hand.foJ;

// Write a program to print prime numbers between 10 and 99.

public class Handson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		String pn="";
		
		for(int n=10;n<=100;n++) {
			int c=0;
			for(num=n;num>=1;num--) {
				if(n%num == 0) {
					c = c+1;
				}
			}
			
			if(c == 2) {
				pn = pn+n+" ";
			}
		}
		System.out.println(pn);

	}

}
