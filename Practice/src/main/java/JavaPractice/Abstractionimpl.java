package JavaPractice;

public class Abstractionimpl {

	public static void main(String[] args) {
		
		Square s1 = new Square(5);
		
		Shapes s2 = new Square(8);
		
		DummyInterface d1 = new Circle(4);
		
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		
		System.out.println(s2.getArea());
		System.out.println(s2.getPerimeter());
		
		Circle c1 = new Circle(7);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		s2 = new Circle(8);
		
		System.out.println(s2.getArea());
		System.out.println(s2.getPerimeter());
		c1.show();
		d1.show();
	}

}
