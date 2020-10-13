package oop.inheritance;

public class Children extends Parents{
	
	public Children() {}
	public Children(String lastName){
		super(lastName);
	}
	public void atheletic() {
		System.out.println("Childrens are atheletic");
	}
}
