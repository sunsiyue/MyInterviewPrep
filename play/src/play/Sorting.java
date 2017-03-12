package play;

import java.util.Arrays;

public class Sorting {
	public static void bubbleSort(int[] input) {
		int counter = 0;
		for(int i=0; i<input.length-1; i++) {
			for(int j=0; j<input.length-1-i; j++) {
				
				if(input[j] > input[j+1]) {
					System.out.println(++counter);
					int tmp = input[j];
					input[j] = input[j+1];
					input[j+1] = tmp;
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {3,2,4,1,5,6,9,8,7};
		System.out.println(Arrays.toString(test));
		bubbleSort(test);
		System.out.println(Arrays.toString(test));
	}

}
