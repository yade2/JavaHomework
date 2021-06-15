package OOPConcepts;
import java.util.Scanner;

//interface
public class Employee extends Person implements PersonInterface {
	int emp_id;
	double emp_salary;
//	String addr;
	
	Employee(int id, String name,int age, char gender,double salary) {
		super(name,age,gender);
		this.emp_id=id;
		this.emp_salary=salary;
//		this.addr;
	}
	
	public void display() {
		System.out.println(ORGANIZATION);
		System.out.println("------------");
		System.out.println("Employee Id: "+this.emp_id);
		super.display();
		System.out.println("Salary: "+this.emp_salary);
		
	}
	
	public double calculate(int bonus) {
		double netsalary=bonus+ this.emp_salary;
		return netsalary;
	}
	
	public void calculate(Employee obj) {
		System.out.println("Salary: "+String.format("%.2f", obj.emp_salary / 12));
	}



//	Scanner in = new Scanner(System.in);
//	
//	public void createAddress() {
////		//new Address();
//		System.out.println("Street Address");
//		addr = in.nextLine();
//		System.out.println("City");
//		addr = in.nextLine();
//		System.out.println("State");
//		addr = in.nextLine();
//		System.out.println("Zip Code");
//		addr = in.nextLine();
//		
//	}
	
	

//public class Employee extends Person {
//	int emp_id;
//	double emp_salary;
//	
//	Employee(int id, String name,int age, char gender,double salary) {
//		super(name,age,gender);
//		this.emp_id=id;
//		this.emp_salary=salary;
//	}
//
//	public void display() {
//		System.out.println("Id: "+this.emp_id);
//		super.display();
//
//		System.out.println("Salary: "+this.emp_salary);
	}


