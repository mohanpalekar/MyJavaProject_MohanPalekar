package Collections;

public class ConversionsInJava {
	
	public static void main(String[] args) {
		
		String str = "4";
		
		System.out.println(Integer.parseInt(str)*2);
		
		int a = 1234;
		
		System.out.println(String.valueOf(a).concat("!!").length());
		
		float b = Float.valueOf(a);
		
		System.out.println(b);
		
		int c = (int) b;
		
		System.out.println(c);
		
	}

}
