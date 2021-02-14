package 문제풀이;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
//		입력
//		이름 입력: 김길동
//		나이 입력: 100  <=> 전화번호: "011"
//		소속 입력: kg
		String name = JOptionPane.showInputDialog("이름 입력");
		String age = JOptionPane.showInputDialog("나이 입력"); //"100"
		String company = JOptionPane.showInputDialog("소속 입력");
//
//		처리
//		김길동의 나이는 100세이고, 소속은  kg입니다.
		String result = name + "의 나이는 " + age + "세이고, 소속은 " + company + "입니다.";
		//+: 덧셈 연산(산술 연산자)
		//+: 결합 연산(결합 연산자)=> 
		//   결합 시키는 데이터 중 하나라도 String이 있으면 결합으로 판단.
//
//		출력
//		처리한 결과를 화면에 다이얼로그로 보여주세요.
		JOptionPane.showMessageDialog(null, result);
	}

}
