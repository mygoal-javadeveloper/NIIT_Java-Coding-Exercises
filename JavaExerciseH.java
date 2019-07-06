package codings;

public class JavaExerciseH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to get the output 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 5
		 * String substring() method
		 */
		String str1 = "1 2 3 4 5";
		int i,j;
		i=0;
			for (j = 1; j <= str1.length()-5; j++) {
				if (j<=3) {
				System.out.println(str1.substring(0,i+1));
				i=i+2;
				}else {
					i=i+3;
					System.out.println(str1.substring(0,i));
				}
			}
		
		}
	}