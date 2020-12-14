package 배열심화;

import java.util.Random;

public class 엄청많은양최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);//0~999
		}
		
		//최대값을 찾아보세요.
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		int max = num[0];
		int count = 0;
		String total = "";
		for (int i = 1; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
				//System.out.println("위치는 " + i);
				total = total + " " + i;
				count++;
			}
		}
		
		System.out.println("최대값은 " + max);
		System.out.println("최대값의 개수는  " + count);
		System.out.println("최대값의 위치는  " + total);

	}
}




