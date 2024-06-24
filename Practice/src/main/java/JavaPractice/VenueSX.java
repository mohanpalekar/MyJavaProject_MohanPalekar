package JavaPractice;


//child class
public class VenueSX extends Car{

	public double fuelCapacity;
	private double topSpeed;
	
	public VenueSX(String model, String color, double mileage, String type, double fuelCapacity, double topSpeed) {
		super(model, color, mileage, type);
		// TODO Auto-generated constructor stub
		this.fuelCapacity = fuelCapacity;
		this.topSpeed = topSpeed;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "VenueSX [fuelCapacity=" + fuelCapacity + ", topSpeed=" + topSpeed + "]";
	}

	
	

	
}
