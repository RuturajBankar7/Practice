package com.module3;

import java.util.Scanner;


public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		
		int originalNumber=number;
		int reverseNumber=0;
		
		while(number>0)
		{
			int digit=number%10;
			reverseNumber=reverseNumber*10+digit;
			number/=10;
			
		}
		
		if (originalNumber == reverseNumber) 
		{
			System.out.println(originalNumber + " is a palindrome.");
	    }else 
	    {
	    	System.out.println(originalNumber + " is not a palindrome.");
	    }
	}

}
