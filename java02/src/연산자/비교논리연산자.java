package 연산자;

import javax.swing.JOptionPane;

public class 비교논리연산자 {

	public static void main(String[] args) {
		// ==, !=, >, >=, <, <= 
		//비교연산자의 결과는 무슨 타입일까요?
		//항상 boolean(true/false)
		//비교연산자는 기본형만 비교 가능하다.
		char 비밀번호 = 'p';
		char 입력번호 = 'q';
		if (비밀번호 == 입력번호) { //맞으면(true)
			JOptionPane.showMessageDialog(null, "입장하세요.");
		} else { //틀리면(false)
			JOptionPane.showMessageDialog(null, "재입력하세요.");
		}
		
		double change = 2.2;
		if (change > 2) { //true
			JOptionPane.showMessageDialog(null, "다이어트 성공");
		}
		
		//논리연산자: 조건이 여러 개인 경우 사용
		//모든 조건이 모두  true이면 결과를 true라면 판단하고 싶은 경우
		//and연산자(&&)
		//하나라도 조건이 true이면 결과를 true라고 판단하고 싶은 경우
		//or연산자(||)
		if (비밀번호 == 입력번호  ||  change > 2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전");
		}
		
	}

}
