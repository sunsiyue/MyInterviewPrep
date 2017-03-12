package play;

public class Solution {
	
	public static String reverseString(String input) {
		String res = new StringBuffer(input).reverse().toString();
		return res;
	}
	
	public static String reverseIteratively(String input) {
		StringBuilder sb = new StringBuilder();
		char[] ca = input.toCharArray();
		for(int i=0; i<ca.length; i++) {
			char tmp = ca[i];
			ca[i] = ca[input.length()-i];
			ca[input.length()-i] = tmp;
		}
		return new String(ca);
	}
	
	public static String reverseRecursively(String input) {
		if(input.length() < 2) return input;
		return reverseIteratively(input.substring(1)) + input.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("sunsiyue"));
		System.out.println(reverseIteratively("sunsiyue"));
		System.out.println(reverseRecursively("recursively"));
	}

}
