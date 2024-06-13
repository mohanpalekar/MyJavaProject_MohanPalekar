package JavaPractice;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		
		//less than or equal 10
		//between 11 to 100
		//between 101 to 1000
		//greater than 1000
		
		if(num1<=10) {
			System.out.println("less than or equal 10");
		}else if(num1>10 && num1<101) {
			System.out.println("between 11 to 100");
		}else if(num1>100 && num1<1001) {
			System.out.println("between 101 to 1000");
		}else System.out.println("greater than 1000");
			
	}

}
