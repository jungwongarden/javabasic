package 배열기본;

import java.util.Random;

public class 배열에값넣기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] s = new int[10000]; 
		//0,1,2: 위치값은 0부터 시작, 인덱스(index)
//		s[0] = r.nextInt(100);
//		s[1] = r.nextInt(100);
//		s[2] = r.nextInt(100);
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(100);
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
