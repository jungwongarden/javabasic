package 배열심화;

import java.util.Arrays;

public class 많은데이터정렬 {

	public static void main(String[] args) {
		int[] num = {100, 77, 22, 55, 66};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("최대값은 " + num[num.length - 1]);
	}

}
