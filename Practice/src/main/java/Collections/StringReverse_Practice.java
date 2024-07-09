package Collections;

public class StringReverse_Practice {

	public static void main(String[] args) {
		
		String str = "JavCoding";

		char [] ch = str.toCharArray();

		char [] result = new char[ch.length];	
		
		int j=0;
		for(int i=ch.length-1; i>=0; i--) {
			result[j] =	ch[i];
			j++;
		}
		
		System.out.println(result);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		
		System.out.println(sb.reverse());
	}

}
