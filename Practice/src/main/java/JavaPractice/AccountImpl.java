package JavaPractice;

public class AccountImpl {

	public static void main(String[] args) {

		Account ac1 = new Account(123123123l, "Account1", 123456.06);

		//		ac1.accountName = "Account1";
		//		ac1.accountNumber = 123123123l;
		//		ac1.balance = 123456.06;

		ac1.setAccountNumber(8274849393l);
		System.out.println(ac1);

		System.out.println(ac1.getAccountNumber());
		
		Account ac2 = new Account(123123124l, "Account2", 123456.06);
		Account ac3 = new Account(123123125l, "Account3", 23456.06);
		Account ac4 = new Account(123123126l, "Account4", 12456.06);
		Account ac5 = new Account(123123127l, "Account5", 12345.06);
		Account ac6 = new Account(123123128l, "Account6", 1456.06);
		
		System.out.println("==============================================");
		//if balance > 20000 print the name
		
		Account [] array = {ac2, ac3, ac4, ac5, ac6};
		
		double totalBalance = 0;
		
		for(Account a : array) {
			totalBalance = totalBalance + a.getBalance();
			if(a.getBalance() >= 20000) {
				System.out.println(a.getAccountName());
			}
		}
		
		System.out.println("Total Balance is : "+totalBalance);
		
		Object obj = new Object();
		
		obj = ac1;
		
		obj = 12;
		
		obj = true;
		
		obj = new String[4];
		
		obj = new float [4];
		
		
		
		
	}

}
