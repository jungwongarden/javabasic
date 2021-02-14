package 배열응용;

import java.util.Random;


public class 아무거나만들어주는부품 {

	public static void main(String[] args) {
		//랜덤(random)
		int[] num = new int[100];
		Random r = new Random();//참조형(주소)
		for (int i = 0; i < 100; i++) {
			int data = r.nextInt(100); //-21~21억=>0~99
			num[i] = data;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i +": " + num[i]);
		}
		

	}
}
