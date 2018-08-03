package javaTest;

public class Pascal1 {

	public static void main(String[] args) {
		print1(5);
		System.out.println();
		print2(5);

	}

	private static void print2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%s ", calculate(i, j));
			}
			System.out.println();
		}
		
	}

	private static int calculate(int i, int j) {
		if ( j ==0 || j == i) return 1;
		return calculate(i -1, j-1) + calculate(i -1, j);
		
	}

	private static void print1(int n) {
		for (int i = 0; i < n; i++) {
			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.printf("%s ", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
