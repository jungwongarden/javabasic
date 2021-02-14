package 배열응용;

import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		// 토익문제당 답안지 999개
		// 내 답안지 999개
		int[] 답안 = new int[999]; // {0,0,....}
		int[] 내답 = new int[999];

		// 1~4번 객관식
		Random r = new Random(5); // 씨앗값(seed값 설정)
		for (int i = 0; i < 답안.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 0~3 + 1 => 1~4
		}
		for (int i = 0; i < 내답.length; i++) {
			내답[i] = r.nextInt(4) + 1; // 0~3 + 1 => 1~4
		}
		for (int i = 0; i < 답안.length; i++) {
			System.out.println(i + ": " + 답안[i] + " <-> " + 내답[i]);
		}
		// 맞은 개수 카운트, 틀린 개수 카운트
		// 맞은 개수가 토익점수를 출력
		int count = 0, count2 = 0;
		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] == 내답[i]) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("맞은 개수: " + count + "개");
		System.out.println("틀린 개수: " + count2 + "개");
		System.out.println("토익 점수: " + count + "점");

	}

}
