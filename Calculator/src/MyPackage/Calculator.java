package MyPackage;
import java.util.Scanner;
public class Calculator {

		
		static int add(int num1, int num2) {
			int outcome = num1 + num2;
			return outcome;
		}

		static int subtract(int num1, int num2) {
			int outcome = num1 - num2;
			return outcome;
		}

		static int multiply(int num1, int num2) {
			int outcome = num1 * num2;
			return outcome;
		}

		static void divide(int num1, int num2) {
			System.out.println(num1 + "/" + num2);
		}

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int num1, num2, outcome, choice;
			System.out.println("Enter two numbers:");
			
			num1 = scan.nextInt();
			num2 = scan.nextInt();

			System.out.println("Select");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Equal to: " + add(num1, num2));
				break;
			case 2:
				System.out.println("Equal to: " + subtract(num1, num2));
				break;
			case 3:
				System.out.println("Equal to: " + multiply(num1, num2));
				break;
			case 4:
				divide(num1, num2);
				break;
			case 5:
				System.out.println("We are done!");
				System.exit(0);
			default:
				System.out.println("Pick another number");
				break;
			}


		}

	}