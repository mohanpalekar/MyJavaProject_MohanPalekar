package JavaPractice;

public class EmployeeImpl {


	public static void main(String[] args) {


		Employee e1 = new Employee("Emp1", 89833249832l, 34000.74f);

		System.out.println(e1.getSalary());

		float salary = e1.getSalary();
		
		System.out.println("Annual Salary is "+salary*12);
		
		e1.getAnnualSalary();
		
		float salaryAn = e1.getAnnualSalary1();
		
		System.out.println(salaryAn);
		
		float tax = (salaryAn * 10 / 100);
		System.out.println("Tax : "+tax);
		
		System.out.println(salaryAn-tax);
		
		System.out.println(e1.geteID());
		
		//e1.seteName("Emp2");
		
		System.out.println(e1.getName());
		
		System.out.println(e1.toString());
		Employee e2 = new Employee("Emp2", 89833249833l, 34000.74f);
		Employee e3 = new Employee("Emp3", 89833249834l, 24000.74f);
		Employee e4 = new Employee("Emp4", 89833249835l, 64000.74f);
		Employee e5 = new Employee("Emp5", 89833249836l, 54000.74f);
		
		String [] str = new String [5];
		
		Employee [] empArray = {e1, e2, e3, e4, e5};
		
		for (Employee e : empArray) {
			System.out.println(e);
		}
		
	}

}
