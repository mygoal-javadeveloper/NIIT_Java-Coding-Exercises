package codings;

public class JavaExerciseA {
	/*
	 * to get the output 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 5
	 * for loop
	 */
	private static int[][] arr1;
	private static int i, j=0, j1;

	JavaExerciseA() {
		arr1 = new int[4][5];
		for (i = 0; i < 4; i++) {
			if (j < 3) {
				j1 = i;
			} else {
				j1 = i + 1;
			}
			for (j = 0; j <= j1; j++) {
				arr1[i][j] = j + 1;
			}
		}
	}

	void printarr() {

		for (i = 0; i < 4; i++) {
			if (i < 3) {
				j1 = i;
			} else {
				j1 = i + 1;
			}
			for (j = 0; j <= j1; j++) {
				System.out.print(arr1[i][j] + (arr1[i][j] <= j1 ? " " : ""));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExerciseA obj1 = new JavaExerciseA();
		obj1.printarr();
	}

}
