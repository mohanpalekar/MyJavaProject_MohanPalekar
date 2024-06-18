package JavaPractice;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter some input");

		int a = sc.nextInt();

		System.out.println("Input is "+a);

		System.out.println("Enter some input2");

		boolean a1 = sc.nextBoolean();

		System.out.println("Input is "+a1);

	}

}
