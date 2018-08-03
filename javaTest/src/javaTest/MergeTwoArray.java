package javaTest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeTwoArray {

	public static void main(String[] args) {
		int [] arr1 = new int[]{7,3,5,9};
		int [] arr2 = new int[]{2,6,11,4};
		
		BubbleSort.bubble(arr1);
		BubbleSort.bubble(arr2);
		merge(arr1, arr2);
	}
	private static void merge(int [] arr1, int [] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int [] arr3 = new int [arr1.length + arr2.length];
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while (i < arr1.length) {
			System.out.println(" arr1[" + i + "] = " + arr1[i]);
			arr3[k++] = arr1[i++];
		}
		
		while (j < arr2.length) {
			System.out.println(" arr2[" + j + "] = " + arr2[j]);
			arr3[k++] = arr2[j++];
		}
		
		System.out.println(
				Arrays.stream(arr3).boxed().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
