package JavaPractice;

public class Array6 {
	
	public static void main(String[] args) {
		
		int [] arr = new int [10];

		arr[0] = 45;
		arr[1] = 35;
		arr[2] = 48;
		arr[3] = 62;
		arr[4] = 75;
		arr[5] = 07;
		arr[6] = 80;
		arr[7] = 45;
		arr[8] = 50;
		arr[9] = 45;
		
		int a1 = 0;
		int a2 = 0;

		for(int g: arr) {
			if(g<=50) {
				a1++;
			}
			else a2++;
		}
		
		System.out.println("Numbers less than equal to 50 : "+a1);
		System.out.println("Numbers more than 50 : "+a2);
	}

}
