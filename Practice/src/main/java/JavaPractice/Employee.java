package JavaPractice;

public class Employee {

	//eName
	//eID
	//eSalary

	private String eName;
	private long eID;
	private float eSalary;

	//constructor

	public Employee(String eName, long eID, float eSalary) {
		this.eName = eName;
		this.eID = eID;
		this.eSalary = eSalary;
	}

	//	public void getSalary() {
	//		System.out.println("Salary is "+this.eSalary);
	//	}

	public float getSalary() {
		return this.eSalary;
	}
	
	public void getAnnualSalary() {
		System.out.println("Annual Salary is: "+this.eSalary*12);
	}
	
	public float getAnnualSalary1() {
		return this.eSalary*12;
	}
	
	public String getName() {
		return this.eName;
	}
	
	public long geteID() {
		return this.eID;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eID=" + eID + ", eSalary=" + eSalary + "]";
	}
	

}
