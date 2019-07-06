package codings;

public class JavaExerciseI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to get the output 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 5
		 * String class charAt(index) method
		 */
		String str1 = "1 2 3 4 5";
		int i,j, i1;
			for (j = 1; j <= str1.length()-5; j++) {
				switch(j){
				case 2:
					i1=j;
					break;
				case 3:
					i1=j+1;
					break;
				case 4:
					i1=j+4;
					break;
				default:
					i1=0;
					break;
				}
				for(i=0; i<=i1; i++) {
				System.out.print(str1.charAt(i));
				}
				System.out.println();
			}
		}
	}


