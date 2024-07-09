package Collections;

public class Exc1 {
	
	public static void main(String[] args) throws CustExc{
		
		try {
			System.out.println(10/1);
			System.out.println("Try block");
			throw new CustExc("CustException");
		}
		catch(CustExc e) {
			System.out.println("Catch block");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("mandatory finally block");
		}
		
		throw new CustExc("CustException1111");
	}

}
