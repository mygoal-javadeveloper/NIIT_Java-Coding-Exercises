package codings;

public class JavaExercise3 {
	/*
	 *    x
	 * 
	 *   xxx
	 * 
	 *  xxxxx
	 * 
	 * xxxxxxx
	 * 
	 *  xxxxx
	 * 
	 *   xxx
	 * 
	 *    x
	 */

	int num1 = 7;

	void printdiamond() {
		int num = 8, count;
		for (int i = 0; i < num1; i++) {
			count = num / 2;
			for (int j = 0; j < num1; j++) {

				if ((j == count) && ((i == 0) || (i == 6))) {
					System.out.print("x");
				} else if ((j == count) && ((i == 1) || (i == 5))) {
					for (int k = 0; k < count; k++) {
						System.out.print("x");
						j++;
					}
				} else if ((j == count) && ((i == 2) || (i == 4))) {
					for (int k = 0; k <= (count + count); k++) {
						System.out.print("x");
						j++;
					}
				} else if ((j == count) && ((i == 3))) {
					for (int k = 0; k < num1; k++) {
						System.out.print("x");

					}
					j = 6;
				} else {
					System.out.print(" ");
				}
			}
			if (i < 3) {
				num = num - 2;
			} else {
				num = num + 2;
			}
			if (i == 3) {
				num = 4;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		JavaExercise3 obj1 = new JavaExercise3();
		obj1.printdiamond();
	}

}