package javaTest;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(calc(3));
		System.out.println(calc1(3));
	}

	private static int calc1(int i) {
		int num = 1;
		for (int j = 2; j <= i; j++) {
			num = num * j;
			
		}
		return num;
	}

	private static int calc(int i) {
		if (i == 0) return 1;
		return i*calc(i -1);
		
	}

}
