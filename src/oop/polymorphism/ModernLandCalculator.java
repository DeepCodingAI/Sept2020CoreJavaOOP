package oop.polymorphism;

public class ModernLandCalculator extends LandCalculator{

	@Override
	public int areaOfLand(int pointA, int pointB, int poinC, int pointD) {
		int total = pointA + pointB + poinC + pointD + 1;
		return total;
	}
}
