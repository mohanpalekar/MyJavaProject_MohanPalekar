package JavaPractice;

import java.util.StringTokenizer;

public class StringsInJava {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str);

		str.concat("Python");

		System.out.println(str);

		str = str.concat("Python");

		System.out.println(str);

		final int i =9;

		//i=10;
		System.out.println(i);

		String uname = "jaksad";
		final String pass = "pass";

		uname = "njjajcas";
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("I am string");
		
		sb.append(" Appended");
		
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("I am Builder");
		
		sb1.append(29248832.09);
		
		System.out.println(sb1.toString());
		
		System.out.println(sb.reverse());
		
		StringTokenizer token = new StringTokenizer("My_Name_is Java_8093589 true", "_");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

	}
}
