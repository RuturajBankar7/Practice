package com.module8;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		
		if(n<0)
		{
			System.out.println("Please enter a positive number");
		}
		else
		{
			int factorial=1;
			int i=1;
			while(i<=n)
			{
				factorial *=i;
				i++;
			}
			
			System.out.println("Factorial of "+n+" is : "+factorial);
		}

	}

}
