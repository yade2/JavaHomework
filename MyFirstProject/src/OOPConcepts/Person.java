package OOPConcepts;

public class Person {
	//not directly associated with object; does not tell you the property of an object
	static int count=0;
	
	//non static: will be associated directly with object. Each object can have it's own name,gender,age
	String pname;
	int page;
	char pgender;
	
	public Person() {
		count++;
	}
	
	public Person(String name, int age, char gender) {
		pname=name;
		page=age;
		pgender=gender;
		count++;
	}
	
	public void display() {
		System.out.println("Name: "+this.pname);
		System.out.println("Gender: "+this.pgender);
		System.out.println("Age: "+this.page);
	}
	
	public void display(Person obj) {
		System.out.println("within this parameterized display...");
		System.out.println("Name: "+obj.pname);
	}
	
	public static void totalPerson() {
		System.out.println("total amount of people: "+count);

	}

}
