package in.arc.beans;

public class Car {

	private Engine engine;
	
	public Car() {
		System.out.println("Car.Car() :: 0param CONSRUCTOR");
	}
	public Car(Engine engine) {
		System.out.println("Car.Car() :: 1param CONSRUCTOR");
		this.setEngine(engine);
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		boolean status = engine.start();
		if (status) {
			System.out.println("Car Started using "+engine.toString());
		}else {
			System.out.println("Engine trouble ");
		}
	}
	
}
