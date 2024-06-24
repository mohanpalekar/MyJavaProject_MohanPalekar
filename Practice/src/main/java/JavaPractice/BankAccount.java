package JavaPractice;

public class BankAccount {

	private String accountType;
	private long accountNumber;
	private boolean isAccountActive;
	
	public BankAccount(String accountType, long accountNumber, boolean isAccountActive) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.isAccountActive = isAccountActive;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isAccountActive() {
		return isAccountActive;
	}

	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}

	@Override
	public String toString() {
		return "BankAccount [accountType=" + accountType + ", accountNumber=" + accountNumber + ", isAccountActive="
				+ isAccountActive + "]";
	}
	
	

}
