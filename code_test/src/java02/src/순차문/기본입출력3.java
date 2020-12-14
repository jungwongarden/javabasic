package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력3 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("숫자입력1");
		String data2 = JOptionPane.showInputDialog("숫자입력2");
		
		int d1 = Integer.parseInt(data1); //"200"->200
		int d2 = Integer.parseInt(data2);
		
		int data3 = d2 + d1;//산술연산자!
		
		JOptionPane.showMessageDialog(null, "덧셈의 결과는 " + data3);
		

	}

}
