package JavaPractice;

public class AccountImpl1 {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount(null, 0, false);
		
		CurrentAccount c1 = new CurrentAccount(null, 0, false, 0);
		
		SalaryAccount s1 = new SalaryAccount(null, 0, false, 0);
		
		c1.getAccountNumber();
		s1.getAccountNumber();
		
		
	}

}
