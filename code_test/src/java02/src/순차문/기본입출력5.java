package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력5 {

	public static void main(String[] args) {
		final double PI = 3.14;//상수
		String data1 = JOptionPane.showInputDialog("반지름입력");

		double d1 = Double.parseDouble(data1);

		double result = PI * d1 * d1;// 산술연산자!

		JOptionPane.showMessageDialog(null, "원의 면적은 " + result);

	}

}
