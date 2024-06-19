package JavaPractice;

public class Course1 {

	public static void main(String[] args) {
		
		String [] topics = {"T1", "T2", "T3"};
		
		Course c1 = new Course("C111", 12, topics);
		
		System.out.println(c1.getSyllabus());
		
		String [] s1 = c1.getSyllabus();
		
		for(String s: s1) {
			System.out.println(s);
		}
		
		System.out.println(c1.getCourseName().toLowerCase().concat("Hey"));
		
		System.out.println(c1.getCourseDuration());
		
		System.out.println(c1.toString());
	}
}
