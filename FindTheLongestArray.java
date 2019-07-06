package codings;

import java.util.Scanner;

public class FindTheLongestArray {
	Scanner scan;
	int[] arrone, arrtwo;

	void getArrays() {
		scan = new Scanner(System.in);
		int numone, numtwo;
		System.out.println("Enter the lenght of first array: ");
		numone = scan.nextInt();
		System.out.println("Enter the lenght of second array: ");
		numtwo = scan.nextInt();
		arrone = new int[numone];
		arrtwo = new int[numtwo];
		System.out.println("Enter the elements in first array: ");
		for (int i = 0; i < arrone.length; i++) {
			System.out.print("Enter the element on the Index No. " + i + " : ");
			arrone[i] = scan.nextInt();
			System.out.println();
		}
		System.out.println("Enter the elements in second array: ");
		for (int i = 0; i < arrtwo.length; i++) {
			System.out.print("Enter the element on the Index No. " + i + " : ");
			arrtwo[i] = scan.nextInt();
			System.out.println();
		}
	}

	void findLongestArray() {
		if (arrone.length > arrtwo.length) {
			System.out.println("Length of first array is longer: ");
			for (int i = 0; i < arrone.length; i++) {
				System.out.println("The Element on the Index No. " + i + " : " + arrone[i]);
			}
		} else if (arrone.length < arrtwo.length) {
			System.out.println("Length of second array is longer: ");
			for (int i = 0; i < arrtwo.length; i++) {
				System.out.println("The Element on the Index No. " + i + " : " + arrtwo[i]);
			}
		} else {
			System.out.println("Length of first array and second array is same: ");
			System.out.println("First Array: ");
			for (int i = 0; i < arrone.length; i++) {
				System.out.println("The Element on the Index No. " + i + " : " + arrone[i]);
			}
			System.out.println("Second Array: ");
			for (int i = 0; i < arrtwo.length; i++) {
				System.out.println("The Element on the Index No. " + i + " : " + arrtwo[i]);
			}
		}
	}

	public static void main(String[] args) {
		FindTheLongestArray obj1 = new FindTheLongestArray();
		obj1.getArrays();
		obj1.findLongestArray();

	}
}
