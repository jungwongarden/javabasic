package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력4 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("숫자입력1");
		String data2 = JOptionPane.showInputDialog("숫자입력2");
		String data3 = JOptionPane.showInputDialog("숫자입력2");
		String data4 = JOptionPane.showInputDialog("숫자입력2");

		int d1 = Integer.parseInt(data1); // "200"->200
		int d2 = Integer.parseInt(data2);
		int d3 = Integer.parseInt(data3);
		int d4 = Integer.parseInt(data4);

		int sum = d1 + d2 + d3 + d4;// 산술연산자!
		double avg = (double)sum / 4;

		JOptionPane.showMessageDialog(null, "평균은 " + avg);

	}

}
