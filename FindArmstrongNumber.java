package codings;

import java.util.Scanner;

public class FindArmstrongNumber {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		long num, armstrongnumber = 0, calnum, num1;
		System.out.println("Enter a Number to find the whether it is a Armstrong Number or not: ");
		num = scan.nextLong();
		num1 = num;
		while (num > 0) {
			calnum = num % 10;
			armstrongnumber = armstrongnumber + (long) (Math.pow(calnum, 3));
			num = num / 10;
		}
		if (armstrongnumber == num1) {
			System.out.println("Input number " + num1 + " is a Armstrong Number? : True.");
		} else {
			System.out.println("Input number " + num1 + " is a Armstrong Number? : False.");
		}
	}
}
