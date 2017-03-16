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
	
	public static String compression_1_5(String input) {
		char[] ca = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while(i<ca.length) {
			int j = i;
			while(j<ca.length && ca[i]==ca[j]) {
				j++;
			}
			sb.append(ca[i]);
			sb.append(j-i+1);
			i=j;
		}
		String ret = new String(sb);
		System.out.println(ret);
		if(ret.length() < input.length()) return ret;
		else return input;
	}
	
	public static boolean isSubString(String s1, String s2) {
		for(int i=1; i<s2.length(); i++) {
			String tmp = s2.substring(i) + s2.substring(0, i-1);
			if(tmp.equals(s1)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "aaabbccc";
		test.toLowerCase();
		int[] a = new int[256];
		Arrays.fill(a, 0);
		
		System.out.println(a.toString());
		
	}

}
