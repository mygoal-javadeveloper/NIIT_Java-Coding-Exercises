package codings;

public class JavaExerciseF{
	/*
	 * to get the output 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 5
	 * Character.forDigit method
	 */
	private static char[][] arr1;
	private static int i, j, j1;

	JavaExerciseF() {
		arr1 = new char[4][5];
		for (i = 0; i < 4; i++) {
				j1 = i;
			if (i == 3) {
				j1 = i + 1;
			}
			for (j = 0; j <= j1; j++) {
                 arr1[i][j] = Character.forDigit(j+1, 10);
			}
		}
	}

	void printarr() {
		for (i = 0; i < 4; i++) {
				j1 = i;
			if (i == 3) {
				j1 = i + 1;
			}
			for (j = 0; j <= j1; j++) {
				System.out.print(arr1[i][j] + (arr1[i][j] <= Character.forDigit(j1, 10) ? " " : ""));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExerciseF obj1 = new JavaExerciseF();
		obj1.printarr();
	}

}
