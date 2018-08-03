package javaTest;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(missing(new int [] {1,2,4,5,6,7}));

	}
	
	private static int missing(int [] arr) {
		int len = arr.length + 1;
		int sum  = len*(len + 1)/2;
		int tempSum = Arrays.stream(arr).boxed().mapToInt(Integer::valueOf).sum();
		System.out.println(String.format("%s :: %s", sum, tempSum));
		return (sum - tempSum);
	}

}
 