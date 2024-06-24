package JavaPractice;


//parent class
public class Car {

	public String model;
	private String color;
	private double mileage;
	private String type;
	
	
	public Car(String model, String color, double mileage, String type) {
		super();
		this.model = model;
		this.color = color;
		this.mileage = mileage;
		this.type = type;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getMileage() {
		return mileage;
	}


	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", mileage=" + mileage + ", type=" + type + "]";
	}

	

}
