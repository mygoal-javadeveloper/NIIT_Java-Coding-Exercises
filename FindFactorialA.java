package codings;

import java.util.Scanner;
import java.math.BigInteger;
/*
 * for number above 20 with BigInteger
 */
public class FindFactorialA {

	static Scanner scan;

	public static void main(String[] args) {
		BigInteger factnum = BigInteger.ONE;
		long num;
		scan = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number to find its Factorial: ");
			num = scan.nextLong();
			for (int x = 1; x <= num; x++) {
				factnum = factnum.multiply(BigInteger.valueOf(x));

			}
			System.out.println(num + "! = " + factnum);

		} catch (Exception ae) {
			System.out.println("Enter only whole numbers.");
		}
	}
}