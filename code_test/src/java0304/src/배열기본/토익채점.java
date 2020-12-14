package 배열기본;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] 정답 = new int[999];
		int[] 내답 = new int[999];
		
		for (int i = 0; i < 정답.length; i++) {
			정답[i] = r.nextInt(4) + 1; //1~4
		}
		for (int i = 0; i < 내답.length; i++) {
			내답[i] = r.nextInt(4) + 1; //1~4
		}
		
		for (int i = 0; i < 정답.length; i++) {
			System.out.println(i + 1 + "번: " + 정답[i] + "<->" + 내답[i]);
		}
		System.out.println("======");
		int count = 0;
		for (int i = 0; i < 내답.length; i++) {
			if(정답[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println("정답인 개수는 " + count);
	}
	
	
	

}
