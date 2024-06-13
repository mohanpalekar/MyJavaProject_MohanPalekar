package JavaPractice;

public class Arrasy5 {
	public static void main(String[] args) {

		int [] arr = new int [10];

		arr[0] = 45;
		arr[1] = 35;
		arr[2] = 48;
		arr[3] = 62;
		arr[4] = 45;
		arr[5] = 07;
		arr[6] = 40;
		arr[7] = 45;
		arr[8] = 29;
		arr[9] = 45;
		
		int frequency = 0;
		
		for (int x: arr) {
			if(x == 29 ) {
				frequency++;
			}
		}
		
		System.out.println("Frequency is : "+frequency);

	}
}
