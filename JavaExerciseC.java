package codings;

public class JavaExerciseC {

	class ComputePrint {
		/*
		 * to get the output 
		 * 1
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 5
		 * inner class, switch and String
		 */
		boolean b1 = true;
		int i = 1;
		String j = "";

		void getprintarr() {
			while (b1) {
				switch (i) {
				case 1:
					j = j + String.valueOf(i);
					System.out.println(j);
					i++;
					break;
				case 2:
					j = j + " " + String.valueOf(i);
					System.out.println(j);
					i++;
					break;
				case 3:
					j = j + " " + String.valueOf(i);
					System.out.println(j);
					i++;
					break;
				case 4:
					j = j + " " + String.valueOf(i) + " " + String.valueOf(i + 1);
					System.out.println(j);
					i++;
					break;
				}

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JavaExercise1C obj1 = new JavaExercise1C();
		// JavaExercise1C.ComputePrint obj2 = obj1.new ComputePrint();
		JavaExerciseC.ComputePrint obj2 = new JavaExerciseC().new ComputePrint();
		obj2.getprintarr();
	}
}