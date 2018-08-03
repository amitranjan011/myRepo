package javaTest;

public class FindInMatrix {

	public static void main(String[] args) {
		 int[][] arr = { 
				 {10, 20, 30, 40},
                 {15, 25, 35, 45},
                 {27, 29, 37, 48},
                 {32, 33, 39, 50}};
		 int num = 37;
		 match(arr, num);

	}

	private static void match(int[][] arr, int num) {
		int row = 0; 
		int col = arr[0].length - 1;
		
		while(row < arr.length && col >= 0 ) {
			if (num == arr[row][col]) {
				System.out.println(String.format("%s found at %s, %s", num, row, col));
				return;
			}
			
			if (arr[row][col] < num) {
				row++;
			} else {
				col--;
			}
		}
		System.out.println("no match found for " + num);
	}
}
