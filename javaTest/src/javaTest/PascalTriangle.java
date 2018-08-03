package javaTest;

public class PascalTriangle {

	public static void main(String[] args) {
		long starts = System.nanoTime();
		System.out.printf("%s", "main starts");
		System.out.println();
		printRecurs(4);
		long ends = System.nanoTime();
		System.out.printf("%s + :: time taken = %d", "main ends", (ends - starts));
	}

	private static void printTriangle(int row) {
	
		for (int i = 0; i < row; i++) {
			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print( number + " ");
				number = number*(i - j)/(j + 1);
			}
			System.out.println();
		}
	}
	
	private static void printTriangle2(int row) {
		for (int i = 0; i < row; i++) {
			int number = 1;
			for (int j = 0; j <= i; j++) {
				if (i == 0 || j == 0) number = 1;
				else number = number * (i - j + 1)/j;
				System.out.printf("%s ", number);
			}
			System.out.println();
		}
	}
	
	private static void printRecurs(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(recurseCalc(i, j) + " ");
			}
			System.out.println();
		}
	}
	private static int recurseCalc(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		}
		return recurseCalc(i - 1, j- 1) + recurseCalc(i - 1, j);
	}

}
