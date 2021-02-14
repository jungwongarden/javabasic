package 복습;

import javax.swing.JOptionPane;

public class 기본데이터 {

	public static void main(String[] args) {
		// 기본데이터 4가지: 정수, 실수, 문자, 논리
		int temp = 30; //저장공간: 변수, 저장공간이름: 변수명
		double move = 0.5;
		char color = 'b';
		//컨트롤+스페이스바 : 자동완성
		boolean open = false; //true
		System.out.println("온도는 " + temp); //결합연산자
		//sysout + 컨트롤+스페이스바
		//null: 없음의 의미,널!
		JOptionPane.showMessageDialog(null, "온도는 " + temp);
		JOptionPane.showMessageDialog(null, "내려간 온도차이 " + move + "도");
		JOptionPane.showMessageDialog(null, "문 색 " + color);
		JOptionPane.showMessageDialog(null, "문 열려있는지여부 " + open);
		
	}

}
