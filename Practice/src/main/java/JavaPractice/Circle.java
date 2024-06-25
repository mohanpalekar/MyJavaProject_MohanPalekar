package JavaPractice;

public class Circle implements Shapes, DummyInterface{

	private double radius;

	@Override
	public double getArea() {
		return 3.14 * this.radius *this.radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void show() {
		System.out.println("I am Circle");
	}

	
}
