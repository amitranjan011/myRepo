package javaTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("start");
		int [] arr = new int[]{3,2,5,6,4};
		//bubble(arr);
		bubbleStream(arr);
		int length = arr.length;
		int temp = 0;
		for (int i = 0; i < length-1; i++) {
			for (int j = 0; j < length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		//Arrays.stream(arr).forEach(System.out::println);
		
		String [] stArr = new String []{"a", "b", "c", "d"};
		//String res = Arrays.stream(stArr).collect(Collectors.joining(","));
		//String res = Arrays.stream(arr).map(String::valueOf).collect(Collectors.joining(","));
		//System.out.println(res);	
	}

	public static void bubble(int [] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i -1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("bubble ::" + 
				Arrays.stream(arr).boxed().map(String::valueOf).collect(Collectors.joining(",")));
	}
	
	public static void bubbleStream(int [] arr) {
		/*System.out.println(
		Arrays.stream(arr).boxed()
			.mapToInt(Integer::valueOf)
			.reduce((i) -> Comparator.comparingInt(i)));*/
			
	}
}
