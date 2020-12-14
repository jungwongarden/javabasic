package 배열기본;

import java.util.Random;

public class 변수에값넣기 {

	public static void main(String[] args) {
		//값을 넣어 테스트할 때 아무값이나 넣어서 테스트
		Random r = new Random(25);//씨앗값(seed, 시드)
		//System.out.println(r.nextInt());
		for (int i = 0; i < 5; i++) {
			int data = r.nextInt(100);//0~99
			System.out.println(data);
		}
		
		
	}

}
