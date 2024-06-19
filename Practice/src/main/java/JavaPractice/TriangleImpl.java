package JavaPractice;

public class TriangleImpl {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(10.01f, 2.00f, 2.01f, 60.00f, 30.00f, 90.00f);
		Triangle t2 = new Triangle(8.00f, 5.00f, 5.00f, 45.00f, 45.00f, 90.00f);
		System.out.println(t1.getPerimeter());
		System.out.println("Is triangle Scalane : "+t1.isScalane());
		System.out.println("Is triangle Scalane : "+t2.isScalane());
		
		System.out.println("Is triagle isoSceles : "+t2.isIsosceles());
		
		t1.setA1(68.00f);
		t1.setA2(32.00f);
		t1.setA3(80.00f);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}

}
