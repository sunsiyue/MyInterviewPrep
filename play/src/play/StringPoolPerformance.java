package play;

import java.util.Date;

public class StringPoolPerformance {
	
	public static void StringWithoutNew() {
		long m1 = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
			String s = "sunsiyue";
		}
		long m2 = System.currentTimeMillis();
		System.out.println(m2-m1);
	}
	
	public static void StringWithNew() {
		long m1 = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
			String s = new String("sunsiyue");
		}
		long m2 = System.currentTimeMillis();
		System.out.println(m2-m1);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWithNew();
		StringWithoutNew();
		
	}
}
