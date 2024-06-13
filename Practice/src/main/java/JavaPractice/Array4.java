package JavaPractice;

public class Array4 {
	
	public static void main(String[] args) {
		
		int [] ar = new int[11];
		
		//declaring an array or setting up the values
		for(int i=0; i<ar.length; i++) {
			ar[i] = i;
		}
		
		int result = 0;
		
		for(int x : ar) {
			result = result + x;
		}
		
		System.out.println("Sum of an array is "+ result);
		
	}

}
