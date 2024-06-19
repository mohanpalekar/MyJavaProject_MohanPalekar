package JavaPractice;

public class Student {
	
	//name
	//roll_no
	//class
	//division
	//yoa
	
	private String name;
	
	private long rollNo;
	
	private String Class;
	
	private char division;
	
	private int yearOfAdmission;
	
	//constructor
	
	public Student(String name, long rollNo, String Class, char division, int yearOfAdmission) {
		this.name = name;
		this.rollNo = rollNo;
		this.Class = Class;
		this.division = division;
		this.yearOfAdmission = yearOfAdmission;
	}
	
	//method
	
	//public/private return_type name 
	
	public void printStudentData() {
		System.out.println("=====================================================");
		System.out.println("Name : "+ this.name);
		System.out.println("Roll No : "+ this.rollNo);
		System.out.println("Class : "+ this.Class);
		System.out.println("Division : "+ this.division);
		System.out.println("Year of Admission : "+ this.yearOfAdmission);
		System.out.println("=====================================================");
	}
	
	public void getRollNo() {
		System.out.println("Roll Number Is : "+this.rollNo);
	}
	
	public void setClass(String Class) {
		this.Class = Class;
	}
	
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setDivision(char division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", Class=" + Class + ", division=" + division
				+ ", yearOfAdmission=" + yearOfAdmission + "]";
	}
	
	
	

}
