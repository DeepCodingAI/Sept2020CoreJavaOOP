package oop.abstraction;

public class Toyota extends MotorVehicle implements Car{

	
	public void carShape() {
	  System.out.println("Car size should not be more than 6 feet ");
		
	}

	
	public void start() {
		System.out.println("Car must have start features in order to start the engine");
		
	}

	public void stop() {
		System.out.println("Car must have break system inorder to stop the car ");
		
	}
	
	public void speed() {
		System.out.println("it can drive at speed of 8o miles per hour");
	}

	public void electricBattery() {
		System.out.println("Electric battery system was designed");
		
	}

	public void fuel() {
		System.out.println("initially runs on gasoline");
		
	}

}
