package codings;

public class JavaExercise2 {
	/*
	 * 54321
	 * 
	 * 5432
	 * 
	 * 543
	 * 
	 * 54
	 * 
	 * 5
	 */

	int num;

	void printnums() {
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= num; j--) {
				System.out.print(j);
			}
			System.out.println();
			num = num + 1;
		}
	}

	public static void main(String[] args) {
		JavaExercise2 obj1 = new JavaExercise2();
		obj1.printnums();
	}
}
