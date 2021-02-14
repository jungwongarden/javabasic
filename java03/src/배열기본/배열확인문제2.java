package 배열기본;

import javax.swing.JOptionPane;

public class 배열확인문제2 {

	public static void main(String[] args) {
		// 1. int[]
		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = (i + 1) * 10;
		}
		System.out.println(s[0] + s[1]);

		// 2. String[]
		String[] s2 = new String[3];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = JOptionPane.showInputDialog("과목 입력");
		}
		System.out.println("**" + s2[0] + "보다는 " + s2[1] + "**");

		// 4. int[]
		int[] s3 = new int[5];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = i + 1;
			// s3[0] = 0 + 1;
			// s3[1] = 1 + 1;
		}
		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i] + " ");
		}
		
		System.out.println();
		// 3. 배열에 넣어할 값이 배열을 만들때 이미 알고 있는 경우,
		// 처음부터 넣으면 된다.
		int[] s4 = { 11, 22, 33, 44 };
		for (int i = 0; i < s4.length; i++) {
			if (s4[i] == 33) {
				System.out.println("33을 찾음.");
				System.out.println("위치는 " + i);
				break;//반복문 종료!
			}
		}

	}

}
