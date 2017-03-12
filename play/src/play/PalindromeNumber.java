package play;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int n) {
		int local_n = n;
		int reverse = 0;
		while(n != 0) {
			reverse *= 10;
			reverse += n%10;
			n /= 10;
			
		}
		return reverse == local_n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12321));
	}

}
