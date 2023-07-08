package demoPackage;

import java.util.Scanner;

public class Account {
	private String accountHolderName;
	private String accountNumber;
	private double Balance=20000;
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName()
	{
		return this.accountHolderName;
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	public double getBalance()
	{
		return this.Balance;
	}
	
	public boolean Withdraw(double Amount)
	{
		if(Balance>=Amount )
		{
			
			Balance=Balance-Amount;
			return true;
		}
		else
		{
			System.err.println("The Account is Sufficient Balance");
			return false;
		}
		
	}
	public boolean Deposite(double Amount)
	{
		if(Amount>0)
		{
			Balance=Balance+Amount;
			return true;
		}
		else
		{
			System.out.println("Invalid Input...");
			return false;
		}
	}
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", Balance="
				+ Balance + "]";
	}
	
}
