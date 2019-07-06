package codings;

public class JavaExerciseG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to get the output 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 5
		 * left shift operator
		 */
		System.out.println("1\n" + "1 " + Integer.toString(1<<1)+"\n"
				+ "1 " + Integer.toString(1<<1)+" " + Integer.toString(1 + (1<<1))+ "\n"
				+ "1 " + Integer.toString(1<<1)+" " + Integer.toString(1 + (1<<1)) +" " + Integer.toString((1<<1) + (1<<1))+" " + Integer.toString(1 + (1<<1)+(1<<1)));
	}

}