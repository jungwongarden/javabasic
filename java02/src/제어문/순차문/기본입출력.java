package 제어문.순차문;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 순차문
		// 1. 입력
		String name = "홍길동";
		//한글자이상 쓸때는 char들을 실로 엮어놓은 String 부품을 써라!
		//String 부품만 기본데이터처럼 많이 사용되므로, 사용법이 기본형처럼 쓸 수 있다.
		String name2 = JOptionPane.showInputDialog("당신의 이름은 "); //"김길동"
		
		// 2. 처리
		String result = name2 + "님 환영합니다.";
		
		// 3. 출력
		JOptionPane.showMessageDialog(null, result);
	}

}
