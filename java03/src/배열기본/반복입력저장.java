package 배열기본;

import javax.swing.JOptionPane;

public class 반복입력저장 {

	public static void main(String[] args) {
		int[] s = new int[5]; //{1,2,3,4,5}
		for (int i = 0; i < 5; i++) {
			String jumsu = JOptionPane.showInputDialog("점수입력");
			s[i] = Integer.parseInt(jumsu);
		}
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i];
		}
		System.out.println("평균은 " + sum / s.length);
	}
}
