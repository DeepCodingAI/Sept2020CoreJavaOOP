package oop.inheritance;

public class Parents extends GrandParents {

	public String lastName;
	public Parents() {}
	public Parents(String lastName) {
		this.lastName = lastName;
		System.out.println(lastName);
	}
	public void heights() {
		System.out.println("Parents have average heights");
	}
}
