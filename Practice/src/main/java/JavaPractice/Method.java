package JavaPractice;

import java.util.Arrays;

public class Method {

	public static void main(String[] args) {
		int num1=347;
		int num2=76;
		int num3=883;
		int [] ax = {2,45,76,2,34,6765,976,23,100,484,45,07,9868};

		System.out.println(sumOfNumbers(num1, num2, num3));
		System.out.println(sumOfNumbers(num1, num3));
		System.out.println(sumOfNumbers(num3, num1));
		System.out.println(sumOfNumbers(num2, num3, num1));
		System.out.println(sumOfNumbers(ax));
		System.out.println(getSmallestNumber(ax));
		System.out.println(getLargestNumber(ax));
		getNumbersGreatterThan100(ax);


	}
	//method overloading
	public static int sumOfNumbers(int a, int b, int c) {
		return a+b+c;
	}

	public static int sumOfNumbers(int a, int b) {
		return a+b;
	}

	public static int sumOfNumbers(int [] a) {
		int finalResult = 0;

		for(int x: a) {
			finalResult = finalResult + x;
		}

		return finalResult;
	}

	public static int getSmallestNumber(int [] a) {
		Arrays.sort(a);
		return a[0];
	}

	public static int getLargestNumber(int [] a) {
		Arrays.sort(a);
		return a[a.length-1];
	}

	public static void getNumbersGreatterThan100(int [] a) {
		System.out.println("=================");
		for(int x : a) {
			if(x < 100) {
				System.out.println(x);
			}
		}
		System.out.println("=================");
	}



}
