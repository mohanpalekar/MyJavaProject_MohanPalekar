package JavaPractice;

public class Objects1 {

	public static void main(String[] args) {

		//Object
		//Student s1 = new Student();


		//Object declaration or initialization or instantiation
		//		s1.name = "Custom1";
		//		s1.division = 'A';
		//		s1.rollNo = 35356346993l;
		//		s1.yearOfAdmission = 2024;
		//		s1.Class = "I";
		//		
		//		s1.name = "Custom3";
		//		
		//		System.out.println(s1.name);
		//		System.out.println(s1.division);
		//		System.out.println(s1.rollNo);
		//		System.out.println(s1.Class);
		//		System.out.println(s1.yearOfAdmission);
		//		
		//		Student s2 = new Student();
		//		
		//		s2.name = "Custom2";
		//		s2.division = 'A';
		//		s2.rollNo = 35356346994l;
		//		s2.yearOfAdmission = 2024;
		//		s2.Class = "I";
		//		
		//		System.out.println(s2.name);
		//		System.out.println(s2.division);
		//		System.out.println(s2.rollNo);
		//		System.out.println(s2.Class);
		//		System.out.println(s2.yearOfAdmission);

		Student s3 = new Student("Custom4", 717188939l, "IV", 'F', 2020);

		s3.printStudentData();
		
		s3.getRollNo();
		
		Student s4 =  new Student("Custom5", 717188940l, "IV", 'F', 2022);
		
		s4.setClass("VII");
		s4.setDivision('B');
		s4.setRollNo(242343243l);
		
		s4.printStudentData();
		
		s4.getRollNo();
		
		System.out.println(s4.toString());


	}

}
