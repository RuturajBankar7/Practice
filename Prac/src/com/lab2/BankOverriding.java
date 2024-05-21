package com.lab2;

import java.util.Scanner;

class BankAccount
{
	private double balance;

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposit of Rs. "+amount+" successful");
		
	}
	
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance -= amount;
			System.out.println("Withdrawal of Rs. "+amount+" successful");
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
}

class SavingsAccount extends BankAccount
{
	private static final double withdrawal_limit=200.0;
	
	public SavingsAccount(double initialBalance)
	{
		super(initialBalance);
	}
	
	public void withdraw(double amount)
	{
		if(amount<=getBalance() && amount<=withdrawal_limit)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Withdrawal limit exceeded or insufficient funds");
		}
	}
}

class CheckingAccount extends BankAccount
{
	private static final double transaction_fee=1.0;
	
	public CheckingAccount(double initialBalance)
	{
		super(initialBalance);
	}
	
	
	public void withdraw(double amount)
	{
		if(amount<=getBalance())
		{
			super.withdraw(amount + transaction_fee);
		}
		else
		{
			System.out.println(" insufficient funds");
		}
	}
	
}

public class BankOverriding {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the initial balance for Saving Account : ");
		double initialBalanceSavings=sc.nextDouble();
		SavingsAccount sa=new SavingsAccount(initialBalanceSavings);
		
		System.out.println("Enter initial balance for Checking Account : ");
		double initialBalanceChecking=sc.nextDouble();
		CheckingAccount ca=new CheckingAccount(initialBalanceChecking);
		
		 System.out.println("Options:");
	        System.out.println("1. Deposit only in Savings Account");
	        System.out.println("2. Deposit only in Checking Account");
	        System.out.println("3. Deposit in both Savings Account and Checking Account");
	        System.out.println("4. Withdraw only from Savings Account");
	        System.out.println("5. Withdraw only from Checking Account");
	        System.out.println("6. Withdraw from both Savings Account and Checking Account");
	        System.out.println("7. Do all (Deposit and Withdraw from both Savings Account and Checking Account)");
	        System.out.print("Enter your choice: ");
	        int choice=sc.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	System.out.println("Enter amount to deposit in to Savings Account : ");
	    		double depositAmountSavings= sc.nextDouble();
	    		sa.deposit(depositAmountSavings);
	    		break;
	    		
	        case 2:
	        	System.out.println("Enter amount to deposit into Checking Account : ");
	    		double depositlAmountChecking= sc.nextDouble();
	    		ca.deposit(depositlAmountChecking);
	    		break;
	    		
	        case 3:
	        	System.out.println("Enter amount to deposit in to Savings Account : ");
	        	depositAmountSavings= sc.nextDouble();
	        	sa.deposit(depositAmountSavings);
	    		System.out.println("Enter amount to deposit into Checking Account : ");
	    		depositlAmountChecking= sc.nextDouble();
	    		
	    		ca.deposit(depositlAmountChecking);
	    		break;
	    		
	        case 4:
	        	System.out.println("Enter amount to withdraw from Savings Account : ");
	    		double withdrawalAmountSavings= sc.nextDouble();
	    		sa.withdraw(withdrawalAmountSavings);
	    		break;
	    		
	        case 5:
	        	System.out.println("Enter amount to withdraw from Checking Account : ");
	    		double withdrawalAmountChecking= sc.nextDouble();
	    		ca.withdraw(withdrawalAmountChecking);
	    		break;
	    		
	        case 6:
	        	System.out.println("Enter amount to withdraw from Savings Account : ");
	        	withdrawalAmountSavings= sc.nextDouble();
	        	sa.withdraw(withdrawalAmountSavings);
	    		System.out.println("Enter amount to withdraw from Checking Account : ");
	    		withdrawalAmountChecking= sc.nextDouble();
	    		
	    		ca.withdraw(withdrawalAmountChecking);
	    		break;
	    		
	        case 7:
	        	System.out.println("Enter amount to deposit in to Savings Account : ");
	    		depositAmountSavings= sc.nextDouble();
	    		sa.deposit(depositAmountSavings);
	    		System.out.println("Enter amount to deposit into Checking Account : ");
	    		depositlAmountChecking= sc.nextDouble();
	    		ca.deposit(depositlAmountChecking);
	    		System.out.println("Enter amount to withdraw from Savings Account : ");
	    		withdrawalAmountSavings= sc.nextDouble();
	    		sa.withdraw(withdrawalAmountSavings);
	    		System.out.println("Enter amount to withdraw from Checking Account : ");
	    		withdrawalAmountChecking= sc.nextDouble();
	    		ca.withdraw(withdrawalAmountChecking);
	    		break;
	    		
	    		default:
	    			System.out.println("Invalid choice");
	    		
	    		
	        	
	        }
		
	      /*  System.out.println("Enter amount to deposit in to Savings Account : ");
			double depositAmountSavings= sc.nextDouble();
			sa.deposit(depositAmountSavings);
			
			System.out.println("Enter amount to withdraw from Savings Account : ");
			double withdrawalAmountSavings= sc.nextDouble();
			sa.withdraw(withdrawalAmountSavings);
			
			System.out.println("Enter amount to deposit into Checking Account : ");
			double depositlAmountChecking= sc.nextDouble();
			ca.deposit(depositlAmountChecking);
			
			System.out.println("Enter amount to withdraw from Checking Account : ");
			double withdrawalAmountChecking= sc.nextDouble();
			ca.withdraw(withdrawalAmountChecking);*/
		
		System.out.println("Final balance in Savings Account: Rs." + sa.getBalance());
	    System.out.println("Final balance in Checking Account: Rs." + ca.getBalance());

		

	}

}
