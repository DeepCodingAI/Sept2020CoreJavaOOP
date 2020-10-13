package oop.polymorphism;

public class MeasureLand {

	public static void main(String[] args) {
		LandCalculator cal1 = new LandCalculator();
		int resultOfTwoPoint = cal1.areaOfLand(0, 20);
		System.out.println("Size of Two points: " +resultOfTwoPoint);
		int resultOfThreePoint = cal1.areaOfLand(5, 8, 10);
		System.out.println("Triangle size: " +resultOfThreePoint);
		int resultOfFourPoint = cal1.areaOfLand(6, 8, 10, 12);
		System.out.println("Rectangular size: " + resultOfFourPoint);
		
		ModernLandCalculator modCal = new ModernLandCalculator();
		int resultOfFourPointWithModernCal = modCal.areaOfLand(6, 8, 10, 12);
		System.out.println("Rectangular size with Modern Calculator: " + resultOfFourPointWithModernCal);

	}

}
