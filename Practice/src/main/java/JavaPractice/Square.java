package JavaPractice;

public class Square implements Shapes{
	
	private double side;

	@Override
	public double getArea() {
		return this.side * this.side;
	}

	@Override
	public double getPerimeter() {
		return 4 * this.side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	

	

}
