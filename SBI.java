package demoPackage;

public class SBI {
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAccountHolderName("vinay kumar");
		ac.setAccountNumber("sfwf324");
		System.out.println("Account Holder Name :"+ ac.getAccountHolderName());
		System.out.println("Account Number :"+  ac.getAccountNumber());
		System.out.println("Account Balance  :" +ac.getBalance());
		System.out.println(ac);
		
		
		
	}

}
