package play;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		if(n<3) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(7));
	}

}
