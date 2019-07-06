package codings;

public class JavaExerciseB {

	/*
	 * to get the output 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 5
	 * for loop and String
	 */
	private static String str1;
	private static int i, j, j1;

	public static void main(String[] args) {
		str1 = "";
		for (i = 0; i < 4; i++) {
			if (j < 3) {
				j1 = i;
			} else {
				j1 = i + 1;
			}
			for (j = 0; j <= j1; j++) {
				str1 = str1 + Integer.toString(j + 1);
				if (j1 > 0) {
					str1 = str1 + " ";
				}
			}
			str1 = str1 + "\n";
		}
		System.out.println(str1);
	}
}