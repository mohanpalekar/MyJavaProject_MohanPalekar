package JavaPractice;

public class VenueSXImpl {

	public static void main(String[] args) {
		
		Car c1 = new Car("Vv1", "Black", 14.68, "Manual");
		
		VenueSX v1 = new VenueSX("VSX1", "White", 16.78, "Automatic", 150, 200);
		
		System.out.println(c1.toString());
		
		System.out.println(v1.toString());
		System.out.println(v1.getType());
		//System.out.println(c1.set);
	
		
	}

}
