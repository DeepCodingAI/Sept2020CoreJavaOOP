package oop.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Children child1 = new Children();
		child1.atheletic();
		child1.heights();
		child1.skinColer();
		
		GreatChildren child2 = new GreatChildren();
		child2.skinColer();
		
		GreatGrandChildren child3 = new GreatGrandChildren();
		child3.skinColer();
		
		Children child4 = new Children("clinton");
		child4.heights();
		

	}

}
