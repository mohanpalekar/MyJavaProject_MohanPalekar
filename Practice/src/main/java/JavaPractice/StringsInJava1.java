package JavaPractice;

import java.util.StringTokenizer;

public class StringsInJava1 {

	public static void main(String[] args) {
		
		String username = "myusername";
		
		System.out.println(username);
		
		username.concat("NewString");
		
		System.out.println(username);
		
		
		//Not recommended 
		username = username.concat("NewString");
		
		System.out.println(username);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("username");
		sb.append(123);
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		StringBuffer sf = new StringBuffer();
		
		sf.append("This is new String");
		sf.append(true);
		
		System.out.println(sf);
		
		StringTokenizer st = new StringTokenizer("This_is my_string", "_");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		 int i = 0;
		
		i=9;
		
	}

}
