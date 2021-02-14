package 제어문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력---> 처리---> 출력
		//입력
		String today = JOptionPane.showInputDialog("오늘 요일은");
		String temp = JOptionPane.showInputDialog("오늘 온도는");
		
		//처리:temp String을 double로 바꾸어주어야 비교연산자를 쓸 수 있음.
		double temp2 = Double.parseDouble(temp);
		String result = "";
		if (temp2 > 0) {
			result = "조금 더워요!";
		} else {
			result = "조금 추워요!";
		}
		
		//출력
		JOptionPane.showMessageDialog(null, today + "은 " + result);
	}

}
