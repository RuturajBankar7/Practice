package com.demo;

import java.util.Scanner;

public class OddNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter an integer");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0) {
				continue;
			}

			System.out.println(i);
			sum+=i;
			
		}
		System.out.println("Sum is: "+sum);
	}

}
