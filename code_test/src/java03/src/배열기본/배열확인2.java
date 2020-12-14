package 배열기본;

import javax.swing.JOptionPane;

public class 배열확인2 {

	public static void main(String[] args) {
		//4
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			num3[i] = i + 1;
		}
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i]);
		}
		
		//3
		int[] num2 = { 11, 22, 33, 44};
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] == 33) {
				System.out.println("위치는 " + i);
			}
		}
		// 2
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			data[i] = JOptionPane.showInputDialog("과목입력");
		}
		System.out.println("**" + data[0] + "보다는 " + data[1] + "**");

		// 1
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println(num[0] + num[1]);

	}

}
