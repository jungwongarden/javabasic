package 순차문;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 기본입출력2.java
		//입력: 당신의 기분은? 좋음
		//     당신이 가고 싶은 곳은? 카페
		String data1 = JOptionPane.showInputDialog("당신의 기분은?");
		String data2 = JOptionPane.showInputDialog("당신이 가고 싶은 곳은?");
		
		//처리: "카페가 좋음"
		String data3 = data2 + "가 " + data1;
		
		//출력: 나는 카페가 좋음
		JOptionPane.showMessageDialog(null, "나는 " + data3);
		

	}

}
