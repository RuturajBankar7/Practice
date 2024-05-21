package com.module3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		
		System.out.println("Choose an operation:");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        int choice = sc.nextInt();
        
        double result;
        
        switch (choice) {
        case 1:
            result = n1 + n2;
            System.out.println("Result: " + n1 + " + " + n2 + " = " + result);
            break;
        case 2:
            result = n1 - n2;
            System.out.println("Result: " + n1 + " - " + n2 + " = " + result);
            break;
        case 3:
            result = n1 * n2;
            System.out.println("Result: " + n1 + " * " + n2 + " = " + result);
            break;
        case 4:
            if (n2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = n1 / n2;
                System.out.println("Result: " + n1 + " / " + n2 + " = " + result);
            }
            break;
        default:
            System.out.println("Invalid choice.");
    }
        
	}

}
