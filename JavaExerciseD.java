package codings;

public class JavaExerciseD {
	/*
	 * to get the output 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 5
	 * Ternary Operator
	 */

	public static void main(String[] args) {
		int i=1;
		String str1="";
		System.out.println((i==1)?str1 = str1.concat(Integer.toString(i)):"");
		i++;
		System.out.println((i==2)?str1 = str1.concat(" "  + Integer.toString(i)):"");
		i++;
		System.out.println((i==3)?str1 = str1.concat(" "  + Integer.toString(i)):"");
		i++;
		System.out.println((i==4)?str1.concat(" "  + Integer.toString(i)+ " "+Integer.toString(i+1)):"");
		
	}
}