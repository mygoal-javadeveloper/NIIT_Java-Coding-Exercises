package codings;

import java.util.*;

public class FindVowelnConsonant {

	private static Scanner scan;
	char ch1;

	FindVowelnConsonant() {
		scan = new Scanner(System.in);
	}

	void consonantandvowel() {
		System.out.println("Enter a single Alphabet letter:");
		ch1 = scan.next().charAt(0);

		if (Character.isAlphabetic(ch1)) {
			if ((ch1 != 'a' & ch1 != 'A') && (ch1 != 'e' & ch1 != 'E') && (ch1 != 'i' & ch1 != 'I')
					&& (ch1 != 'o' & ch1 != 'O') && (ch1 != 'u' & ch1 != 'U')) {
				System.out.println("The entered Alphabet letter is a Consonant.");
			} else {
				System.out.println("The entered Alphabet letter is a Vowel.");
			}
		} else {
			System.out.println("Invalid Character entered.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindVowelnConsonant obj1 = new FindVowelnConsonant();
		obj1.consonantandvowel();

	}

}
