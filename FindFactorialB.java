package codings;

import java.util.Scanner;

public class FindFactorialB {

static Scanner scan;

public static void main(String[] args) {
	long num, factnum = 1;
	scan = new Scanner(System.in);
	try{
		System.out.println("Enter a whole number to find its Factorial: ");
	     num = scan.nextLong();
	for(int x=1; x<=num; x++) {
		factnum = factnum * x;
	}
	 System.out.println(num + "! = " + factnum);
	
	}catch (Exception ae){
		System.out.println("Enter only whole numbers.");
	}
}
}
