package 배열기본;

import java.util.Random;

public class 처음값을모르고있는경우 {

	public static void main(String[] args) {
		int[] s = new int[1000];
		//new는 ram공간을 복사한다는 의미!
		//배열은 초기값으로 자동 초기화
		//int->0
		//나중에 값을 넣는경우
		Random	r = new Random(42);
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(100);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
