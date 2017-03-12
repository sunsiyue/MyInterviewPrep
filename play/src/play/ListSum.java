package play;

import java.util.Arrays;

public class ListSum {
	public static int sumForLoop(int[] input) {
		int sum = 0;
		for(int i: input) {
			sum += i;
		}
		return sum;
	}
	
	public static int sumWhileLoop(int[] input) {
		int sum = 0;
		int count = 0;
		while(count <input.length) {
			sum += input[count];
			count++;
		}
		return sum;
	}
	
	public static int sumRecursion(int[] input, int n) {
		if(n==0) return input[n];
		else return input[n] + sumRecursion(input, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,3,4,5};
		System.out.println(sumForLoop(test));
		System.out.println(sumWhileLoop(test));
		System.out.println(sumRecursion(test, test.length-1));
	}

}
