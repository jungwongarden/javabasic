package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 배열의정렬 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		Random r = new Random(33);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000);
		}
		Arrays.sort(jumsu); //오름차순
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		System.out.println("최대값은 " + jumsu[jumsu.length - 1]);
		
		
		

	}

}
