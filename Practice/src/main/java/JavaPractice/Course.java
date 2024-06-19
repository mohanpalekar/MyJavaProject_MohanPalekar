package JavaPractice;

import java.util.Arrays;

public class Course {

	//CourseName
	//CourseDuration
	//Syllabus
	
	private String courseName;
	private int courseDuration;
	private String [] syllabus;

	public Course(String courseName, int courseDuration, String[] syllabus) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.syllabus = syllabus;
	}

	public String[] getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String[] syllabus) {
		this.syllabus = syllabus;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseDuration=" + courseDuration + ", syllabus="
				+ Arrays.toString(syllabus) + "]";
	}
	
	
	
}
