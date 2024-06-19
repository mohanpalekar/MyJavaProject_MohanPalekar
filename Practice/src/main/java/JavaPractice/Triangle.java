package JavaPractice;

public class Triangle {

	private float side1;
	
	private float side2;
	
	private float side3;
	
	private float a1;
	private float a2;
	private float a3;

	
	public Triangle(float side1, float side2, float side3, float a1, float a2, float a3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	

	public float getSide1() {
		return side1;
	}



	public void setSide1(float side1) {
		this.side1 = side1;
	}



	public float getSide2() {
		return side2;
	}



	public void setSide2(float side2) {
		this.side2 = side2;
	}



	public float getSide3() {
		return side3;
	}



	public void setSide3(float side3) {
		this.side3 = side3;
	}



	public float getA1() {
		return a1;
	}



	public void setA1(float a1) {
		this.a1 = a1;
	}



	public float getA2() {
		return a2;
	}



	public void setA2(float a2) {
		this.a2 = a2;
	}



	public float getA3() {
		return a3;
	}



	public void setA3(float a3) {
		this.a3 = a3;
	}


	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", a1=" + a1 + ", a2=" + a2
				+ ", a3=" + a3 + "]";
	}



	public float getPerimeter() {
		return this.side1+this.side2+this.side3;
	}
	
	public boolean isScalane() {
		if(this.side1 == this.side2) {
			return false;
		}else if(this.side2 == this.side3) {
			return false;
		}else if(this.side1 == this.side3) {
			return false;
		}else return true;
	}
	
	public boolean isIsosceles() {
		if(this.side1 == this.side2 && this.side1 != this.side3 && this.side2 !=this.side3) {
			return true;
		}else if(this.side2 == this.side3 && this.side2 !=this.side1 && this.side3 != this.side1) {
			return true;
		}else return false;
	}

}
