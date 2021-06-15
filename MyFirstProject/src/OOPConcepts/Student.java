package OOPConcepts;

public class Student extends Person implements PersonInterface {
	int stu_id;
	double stu_subject1,stu_subject2,stu_subject3;
	String major;

	
	Student(int id, String name,int age, char gender,double subject1,double subject2,double subject3, String major) {
		super(name,age,gender);
		this.stu_id=id;
		this.stu_subject1=subject1;
		this.stu_subject2=subject2;
		this.stu_subject3=subject3;
		this.major=major;
	}

	public void display() {
		System.out.println(ORGANIZATION);
		System.out.println("Student Id: "+this.stu_id);
		super.display();
		System.out.println("Subject 1 grade: "+this.stu_subject1);
		System.out.println("Subject 2 grade: "+this.stu_subject2);
		System.out.println("Subject 3 grade: "+this.stu_subject3);
		System.out.println("Major: "+this.major);
	
	}
	
	public double calculate(int totalScore) {
		double finalScore=((this.stu_subject1 + this.stu_subject2 + this.stu_subject2) / totalScore);
		return finalScore;
	}

}
