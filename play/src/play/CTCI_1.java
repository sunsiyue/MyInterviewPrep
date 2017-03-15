package play;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CTCI_1 {
	
	public static boolean UniqueChar_1_1(String input) {
		char[] ca = input.toCharArray();
		boolean[] map = new boolean[256];
		
		for(int i=0; i<ca.length; i++) {
			int index = ca[i];
			if(map[index]) return false;
			map[index] = true;
		}
		
		return true;
	}
	
	public static String reverse_1_2(String input, int n) {
		if(n==0) return input;
		return reverse_1_2(input.substring(1), n-1) + input.charAt(0);
	}
	
	public static boolean twoStrings_1_3(String a, String b) {
		if(a.length() != b.length()) return false;
		Map<Character, Integer> m = new HashMap<>();
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		Arrays.sort(ca);
		Arrays.sort(cb);
		String newa = new String(ca);
		String newb = new String(cb);
		return newa.equals(newb);
	}
	
	public static String replace_1_4(String input) {
		String[] tmp = input.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s: tmp) {
			sb.append(s);
			sb.append("%20");
		}
		String ret = sb.toString();
		ret = ret.substring(0, ret.length()-3);
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "sunsiyue sun siyue";
		
		System.out.println(replace_1_4(test));
		
	}

}
