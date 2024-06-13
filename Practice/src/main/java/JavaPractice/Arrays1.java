package JavaPractice;

import java.util.Arrays;

public class Arrays1 {

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

		Arrays.sort(arr);

		//		for(int i = arr.length-1; i>=0; i--) {
		//			System.out.println(arr[i]);
		//		}

		boolean flag = false;

		for(int x : arr) {
			if( x == 29) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("Yes");
		}else System.out.println("No");
		


	}

}
