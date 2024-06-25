package JavaPractice;

import java.util.StringTokenizer;

public class StringInJava2 {

	public static void main(String[] args) {

		String str = "Hey There I am From California and Germany";

		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			System.out.println(sb.append(st.nextToken()).reverse());
			//System.out.println(st.nextToken());
		}
	}

}
