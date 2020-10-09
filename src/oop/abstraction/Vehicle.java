package oop.abstraction;

public interface Vehicle {

	public void fuel();
	
	public static void color() {
		System.out.println("Vehicle color is green");
	}
	
	public static void assembledCountry() {
		System.out.println("Vehicle was assembled in Japan");
	}
}
