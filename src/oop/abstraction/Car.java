package oop.abstraction;

public interface Car {
	
	public abstract void carShape();
	
	public abstract void start();
	
    public abstract void stop();
    
    public static void carWheel() {
    	System.out.println("Car will have 4 wheels");
    }

}
