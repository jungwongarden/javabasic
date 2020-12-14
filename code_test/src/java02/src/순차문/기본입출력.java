package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 1. 입력
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		
		// 2. 처리
		String result = "";
		if (day.equals("일요일") || day.equals("토요일")) {
			result = "주말은 너무 좋아요!!!";
		} else {
			result = "평일은 너무 싫어요!!!";
		}
		
		// 3. 출력
		//System.out.println("당신이 입력한 요일은 " + day + " " + result);
		JOptionPane.showMessageDialog(null, "당신이 입력한 요일은 " + day + " " + result);
		
	}

}
