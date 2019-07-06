package codings;

import java.util.Scanner;

public class FindPrimeNumber {
	static Scanner scan;
	static long num;
    static int count = 0;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
	    
	    try{
	    System.out.println("Enter any Whole Number to find whether it is a Prime Number or Composite Number: ");
	    num = scan.nextLong();
	    
		for(int i=2; i<(num/2); i++) {
			if(num %i == 0) {
				count++;
				break;
			}
		}
			if(count==0) {
				if (num==1) {
				System.out.println(num +" is neither a Prime Number nor a composite number.");
				}else {
					System.out.println(num + " is a Prime Number.");
				}
			}else {
				System.out.println(num + " is a Composite Number.");
			}
	    }catch(Exception e) {
	    	System.out.println("Enter only Whole Numbers.");
	    }
	}

}

