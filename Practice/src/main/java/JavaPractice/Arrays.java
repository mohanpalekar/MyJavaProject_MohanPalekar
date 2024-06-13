package JavaPractice;

public class Arrays {

	public static void main(String[] args) {

		String str = "HSJS";


		//defining an array
		String [] arr = new String [6];

		//initialize or declare or assigned values to array
		arr[0] = "Delhi";
		arr[1] = "Pune";
		arr[2] = "Kolkata";
		arr[3] = "Mumbai";
		arr[4] = "Kokan";
		arr[5] = "Banglore";

		System.out.println(arr.length);
		System.out.println(arr[4]+" , "+arr[5]);

		//				for(int i=0; i<arr.length; i=i+1) {
		//					System.out.println(arr[i]);
		//				}

		for (String s : arr) {
			System.out.println(s);
		}


		//arr[6] = "Noida";
	}

}
