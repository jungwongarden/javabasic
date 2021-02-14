package 배열응용;

import java.util.Random;

public class 아무거나더블값만들어서배열에저장 {

	public static void main(String[] args) {
		// double값 아무거나 만들어서 배열에 50개 저장 후, 프린트
		double[] num2 = new double[50];//{}
		Random	r = new Random();
		for (int i = 0; i < num2.length; i++) {
			num2[i] = r.nextDouble();
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println(i + ": "  + num2[i]);
		}

	}

}
