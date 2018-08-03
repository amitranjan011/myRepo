package javaTest;

public class FloydTriangle {

	public static void main(String[] args) {
		print(5);

	}

	private static void print(int n) {
		int number = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(++number + " ");
			}
			System.out.println();
		}
	}

}
