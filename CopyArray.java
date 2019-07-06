package codings;

import java.util.Scanner;

public class CopyArray {
	static Scanner scan;
	int[][] arrone, arrtwo;

	CopyArray() {
		arrone = new int[4][3];
		System.out.println("Declaring the array one with 4 rows and 3 columns.");
		scan = new Scanner(System.in);
	}

	void enterElements() {
		for (int i = 0; i < arrone.length; i++) {
			for (int j = 0; j < arrone[0].length; j++) {
				System.out.print("Enter Whole Numbers Element at row " + i + " and column " + j + ": ");
				arrone[i][j] = scan.nextInt();
				System.out.println();
			}
		}
	}

	void copyElements() {
		System.out.println("Declaring the second array and Copying the elements of first array in it.");
		arrtwo = new int[arrone.length][arrone[0].length];
		for (int i = 0; i < arrtwo.length; i++) {
			for (int j = 0; j < arrtwo[0].length; j++) {
				arrtwo[i][j] = arrone[i][j];
			}
		}
	}

	void getElements() {
		System.out.println("The Element in first array: ");
		for (int i = 0; i < arrone.length; i++) {
			for (int j = 0; j < arrone[0].length; j++) {
				System.out.print(arrone[i][j] + ", ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The Element in second array: ");
		for (int i = 0; i < arrtwo.length; i++) {
			for (int j = 0; j < arrtwo[0].length; j++) {
				System.out.print(arrtwo[i][j] + ", ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CopyArray obj1 = new CopyArray();
		obj1.enterElements();
		obj1.copyElements();
		obj1.getElements();
	}
}
