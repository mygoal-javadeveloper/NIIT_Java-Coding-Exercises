package codings;

public class JavaExerciseE {
	/*
	 * to get the output 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 5
	 * method local inner class
	 */
	private static String[][] str1;
	private int i, j, j1;
	void computeDisplay() {
		class InsideMethod{
			InsideMethod(){
			str1 = new String[4][5];
			for (i = 0; i < 4; i++) {
					j1 = i;
				
				if (i == 3) {
					j1 = i + 1;
				}
				for (j = 0; j <= j1; j++) {
					str1[i][j] = String.valueOf(j + 1);
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
					System.out.print(str1[i][j] + (j<=j1 ? " " : ""));
				}
				System.out.println();
			}
		}
		}
		InsideMethod obj1 = new InsideMethod();
		obj1.printarr();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExerciseE obj2 = new JavaExerciseE();
		obj2.computeDisplay();
	}

}