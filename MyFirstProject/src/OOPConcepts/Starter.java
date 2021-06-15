package OOPConcepts;
import java.util.Scanner;
public class Starter {
	
	public static void main(String[] args) {
	

		Scanner in = new Scanner(System.in);

		System.out.println("New Employee Record");

		System.out.println("Employee Id: ");
		int emp_id = in.nextInt();


		System.out.println("Name: ");
		String emp_name = in.nextLine();

		System.out.println("Age: ");
		int emp_age = in.nextInt();

		System.out.println("Gender M-male, F-female: ");
		char emp_gender = in.next().charAt(0);

		System.out.println("Salary: ");
		double emp_salary = in.nextDouble();

		Employee emp1 = new Employee(emp_id, emp_name,emp_age, emp_gender, emp_salary);

		emp1.display();
		System.out.println("Salary + bonus is: " + emp1.calculate(1200));
		emp1.calculate(emp1);

		
		System.out.println("------------------------");

		Scanner in2 = new Scanner(System.in);

		System.out.println("New Student Record");

		System.out.println("Student Id: ");
		int id1 = in2.nextInt();

		in2.nextLine();

		System.out.println("Name: ");
		String stu_name = in2.nextLine();

		System.out.println("Age: ");
		int stu_age = in2.nextInt();

		System.out.println("Gender M-male, F-female: ");
		char stu_gender = in2.next().charAt(0);

		System.out.println("Subject 1 Grade: ");
		double stu_subject1 = in2.nextDouble();

		System.out.println("Subject 2 Grade: ");
		double stu_subject2 = in2.nextDouble();

		System.out.println("Subject 3 Grade: ");
		double stu_subject3 = in2.nextDouble();

		in2.nextLine();
		System.out.println("Major: ");
		String major = in2.nextLine();

		Student stu = new Student(id1, stu_name, stu_age, stu_gender, stu_subject1, stu_subject2, stu_subject3, major);

		stu.display();

		double avg = stu.calculate(3);
		System.out.println("Total Score: " + String.format("%.3f", avg));
		
	
	
	//for encapsulation
//	Scanner scan = new Scanner(System.in);
//	
//	Person1 p1=new Person1();
//	System.out.println("Name");
//	pname1 = scan.nextLine();
//	p1.setPname(pname);
//	System.out.println("Age");
//	p1 = scan.nextInt();
//	p1.setPage(page);
//	System.out.println("Gender: Type M-male, F-female");
//	pgender = scan.next().charAt(0);
//	p1.setPgender(pgender);
	

		
//		//students' score 
//		Student stu1=new Student(101, "America Fereira", 28,'F',100.5,90.4,80.3);
//		stu1.display();
	
//		double avg=stu1.calculate(3);
//		System.out.println("Average grade: "+String.format("%.3f", avg));

	
		
		//address
//		Employee emp1=new Employee(101, "America Ferreira", 28,'F',10456.58);
//		Employee emp2=new Employee(122, "Federicco Ruiz", 23,'M',12456.58);
//		
//		emp1.createAddress();
//		emp1.display();
//		
//		System.out.println("Net salary for this employee: "+emp1.calculate(1000));
//		System.out.println();
//		System.out.println();
//		
//		emp2.createAddress();
//		emp2.display();
//		
//		System.out.println("Net salary for this employee: "+emp1.calculate(1200));
//		
		
		
		

//	static void multiply(int num1, int num2) {
//		System.out.println(num1*num2);
//	}
//	
//	static void multiply(float num1, float num2) {
//		System.out.println(num1*num2);
//	}
//	
//	public static void main(String[] args) {
//		
//		multiply(5,5);
//		multiply(123.33f, 23.66f);
		
//		Employee emp1=new Employee(101, "America Ferreira", 28,'F',10456.58);
//		Employee emp2=new Employee(122, "Federicco Ruiz", 23,'M',10456.58);
//		
//		emp1.display();	
//		emp2.display();
	
		
//		Person person1=new Person("Malyikanima Jackson",22,'F');
//		
//		Person person2=new Person("Isamar Rodriguez",21,'F');
//		
//		Person person3=new Person("Neely Neverson",22,'F');
//		
//		Person person4=new Person();
//		Person person5=new Person();
//		
//		person1.display();
//		person2.display();
//		person3.display();
//		person4.display();
//		person5.display();
		
//		Person1 p1=new Person1();
//		
//		p1.setPname("Yadelin");
//		p1.setPage(21);
//		p1.setPgender('F');
//		
//		System.out.println(p1.getPname());
//		System.out.println(p1.getPage());
//		System.out.println(p1.getPgender());
//		
//		Person1 p2=new Person1();
//		
//		p1.setPname("Andrew");
//		p1.setPage(26);
//		p1.setPgender('M');
//		
//		System.out.println(p2.getPname());
//		System.out.println(p2.getPage());
//		System.out.println(p2.getPgender());
//		
//		
//		
//		Person.totalPerson();
		
	}

}
