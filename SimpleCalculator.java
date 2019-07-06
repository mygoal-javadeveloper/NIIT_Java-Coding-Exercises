package codings;

import java.util.Scanner;

public class SimpleCalculator {
	static Scanner scan;

	void Calculate(double num1, double num2, char operatorchar)
			throws ArithmeticException, IllegalArgumentException, Exception {
		switch (operatorchar) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			if ((num1 == 0) && (num2 == 0)) {
				throw new Exception();
			} else if ((num1 > 0) && (num2 == 0)) {
				throw new ArithmeticException();
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			}
		default:
			throw new IllegalArgumentException();

		}

	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double num1;
		double num2;
		char operatorchar;
		SimpleCalculator obj1 = new SimpleCalculator();
		try {
			System.out.println("Enter two numbers (two Operands): ");
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			System.out.println("Enter the operator '+ - * /': ");
			operatorchar = scan.next().charAt(0);
			obj1.Calculate(num1, num2, operatorchar);
		} catch (ArithmeticException ae) {
			System.out.println(ae + " has occured: Division performed by zero.");
		} catch (IllegalArgumentException iae) {
			System.out.println(iae + " has occured: Invalid Operator entered.");
		} catch (Exception e) {
			System.out.println(e + " has occured: Invalid numbers entered.");
		} finally {
			System.out.println("Thanks. You can try once more.");
		}
	}
}
