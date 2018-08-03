package javaTest;

public class FibonacciCalc {

	public static void main(String[] args) {
		calc(5);

	}
	
	private static void calc(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print(fib(j) + " ");
			
		}
	}
	
	private static int fib(int i) {
		if (i == 0) return 0;
		if (i == 1) return 1;
		return (fib(i -1) + fib(i - 2));
		
	}

}
