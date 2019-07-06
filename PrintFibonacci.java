package codings;

public class PrintFibonacci {

	void printFibonaciSeries() {
		int[] num = new int[13];
		num[0] = 0;
		num[1] = 1;
		for (int i = 2; i < 13; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		for (int i = 0; i < 13; i++) {
			System.out.print(num[i] + (i < 13 - 1 ? ", " : ""));
		}
	}

	public static void main(String[] args) {
		PrintFibonacci obj1 = new PrintFibonacci();
		obj1.printFibonaciSeries();
	}
}