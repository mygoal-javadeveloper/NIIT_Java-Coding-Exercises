package codings;

import java.util.Scanner;

public class ReverseStringArray {
	Scanner scan;
	String[] strarr;
	int num;

	void inputStringArray() {
		scan = new Scanner(System.in);
		System.out.println("Enter the lenght of String Array: ");
		num = scan.nextInt();
		strarr = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the String element at row " + i + " : ");
			strarr[i] = scan.next();
		}
	}

	void reverseArray() {
		String str;
		for (int i = 0; i < num / 2; i++) {
			str = strarr[i];
			strarr[i] = strarr[num - i - 1];
			strarr[num - i - 1] = str;
		}
		System.out.println("The reverse String array: ");
		for (int i = 0; i < num; i++) {
			System.out.println("The reverse element in the String array " + "at row " + i + " is now: " + strarr[i]);
		}
	}

	public static void main(String[] args) {
		ReverseStringArray obj1 = new ReverseStringArray();
		obj1.inputStringArray();
		obj1.reverseArray();
	}
}
