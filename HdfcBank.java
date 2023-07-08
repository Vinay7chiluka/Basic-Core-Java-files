package demoPackage;

public class HdfcBank {
	public static void main(String [] args) {
		Account acc=new Account();
		acc.setAccountHolderName("Vinay Kumar Chiluka");
		acc.setAccountNumber("sdfwe13423");
		System.out.println(acc);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("---------------------------------withdraw--------------------------------------");
		System.out.println("---------------------------------withdraw--------------------------------------");
		boolean status=acc.Withdraw(1000);
		if(status)
		{
			System.out.println(acc);
		}
		else
		{
			System.err.println("Insufficient Funds...");
		}
		System.out.println("----------------------------------Deposit----------------------------------");
		System.out.println("----------------------------------Deposit----------------------------------");
		System.out.println("----------------------------------Deposit----------------------------------");
		
		boolean status1=acc.Deposite(150000);
		if(status1)
		{
			System.out.println(acc);
		}
		else
		{
			System.err.println("invalid input...");
		}
		
		
	}
}
