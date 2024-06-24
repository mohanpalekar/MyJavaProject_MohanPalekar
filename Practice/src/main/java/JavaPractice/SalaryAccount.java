package JavaPractice;

public class SalaryAccount extends BankAccount{


	private float RoI;


	public SalaryAccount(String accountType, long accountNumber, boolean isAccountActive, float RoI) {
		super(accountType, accountNumber, isAccountActive);
		// TODO Auto-generated constructor stub
		this.RoI = RoI;
	}


	public float getRoI() {
		return RoI;
	}


	public void setRoI(float roI) {
		RoI = roI;
	}


	@Override
	public String toString() {
		return "SalaryAccount [RoI=" + RoI + "]";
	}



}
