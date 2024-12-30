package A2;

class Vehicle{
	String manufacturer, model;
	int year;
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	void getDetails (){
		System.out.println("Manufacturer: "+this.manufacturer);
		System.out.println("Model: "+this.model);
		System.out.println("Year: "+this.year);
	}
}

class Car extends Vehicle{
	int seatingCapacity;

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	@Override
	void getDetails (){
		System.out.println("Seating Capacity: "+this.seatingCapacity);
	}
	
	void accelerate (){
		System.out.println("Car accelerates..");
	}
	
	void brake (){
		System.out.println("Car brake applied..");
	}
}

class Motorcycle extends Vehicle{
	double engineCapacity;

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	void getDetails (){
		System.out.println("Engine Capacity: "+this.engineCapacity);
	}
	
	void startEngine () {
		System.out.println("Motorcycle engine starts..");
	}
	
	void stopEngine () {
		System.out.println("Motorcycle engine stopped..");
	}
}

class Truck extends Vehicle{
	double cargoCapacity;

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	void getDetails (){
		System.out.println("Cargo Capacity: "+this.cargoCapacity);
	}
	
	void loadCargo (){
		System.out.println("Cargo loaded..");		
	}
	
	void unloadCargo (){
		System.out.println("Cargo unloaded..");
	}
}

public class ProblemStatement2 {
	public static void main(String[] args) {
		Car carObj = new Car();
		Motorcycle motorcycleObj = new Motorcycle();
		Truck truckObj = new Truck();
		
		carObj.setManufacturer("Hyundai");
		carObj.setModel("Verna");
		carObj.setYear(2019);
		carObj.setSeatingCapacity(4);
		carObj.accelerate();
		carObj.brake();
		carObj.getDetails();
		
		
		motorcycleObj.setManufacturer("Honda");
		motorcycleObj.setModel("Activa");
		motorcycleObj.setYear(2024);
		motorcycleObj.setEngineCapacity(600);
		motorcycleObj.startEngine();
		motorcycleObj.stopEngine();
		motorcycleObj.getDetails();
		
		
		truckObj.setManufacturer("Tata");
		truckObj.setModel("Dumper");
		truckObj.setYear(2017);
		truckObj.setCargoCapacity(2000);
		truckObj.loadCargo();
		truckObj.unloadCargo();
		truckObj.getDetails();
	}
}