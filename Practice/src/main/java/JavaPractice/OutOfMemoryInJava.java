package JavaPractice;

public class OutOfMemoryInJava {


	public static void main(String args[]){  

		try {
			System.out.println(10/0);
			System.out.println("Try");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch");
		}
		finally{
			System.out.println("Finally");
		}


	} 
}

