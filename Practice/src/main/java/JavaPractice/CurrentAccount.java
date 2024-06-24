package JavaPractice;

public class CurrentAccount extends BankAccount{


	private double minimumBalance;
	
	public CurrentAccount(String accountType, long accountNumber, boolean isAccountActive, double minimumBalance) {
		super(accountType, accountNumber, isAccountActive);
		// TODO Auto-generated constructor stub
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	
	
}
