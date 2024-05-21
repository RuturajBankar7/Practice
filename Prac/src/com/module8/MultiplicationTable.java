package com.module8;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		System.out.println("Multiplication table of "+n+" : ");
		
		for(int i=1; i<=10; i++)
		{
			int k=i*n;
			System.out.println(n+" * "+i+" = "+k);
		}
		
	}

}
