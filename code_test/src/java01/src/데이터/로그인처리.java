package 데이터;
import javax.swing.JOptionPane;

public class 로그인처리 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("당신의 id입력하세요.");
		String pw = JOptionPane.showInputDialog("당신의 pw입력하세요.");
		//블럭안잡고 한줄 복사: 컨트롤+알트+화살표 아래
		//한줄 이동: 알트+화살표 방향
		//비교 연산자: == 사용불가
		String id2 = "root";
		System.out.println(id.equals(id2));
		//비교의 결과는 항상 boolean(논리형), true/false
		
		String pw2 = "pass";
		System.out.println(pw.equals(pw2));
		
		System.out.println(id.equals(id2) && pw.equals(pw2));
		
		
		
		
		
		
		
	}

}
