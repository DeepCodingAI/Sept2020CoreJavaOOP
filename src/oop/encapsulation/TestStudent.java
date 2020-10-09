package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStName("BOB");
		st1.setStID(101);
		st1.setStDOB("09-20-1990");
		st1.setStGrade('A');
		System.out.println(st1.getStName()+ " "+st1.getStID()+ " "+st1.getStDOB()+ " "+ st1.getStGrade());
		
		Student st2 = new Student("John Doe",102,'B',"05-30-1995");
		System.out.println(st2.getStName()+ " "+st2.getStID()+ " "+st2.getStDOB()+ " "+ st2.getStGrade());
	}

}
