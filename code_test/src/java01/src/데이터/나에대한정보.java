package 데이터;

import javax.swing.JOptionPane;

public class 나에대한정보 {

	public static void main(String[] args) {
		// 기본 데이터에 나에 대한 정보를 넣어서 출력
		// 저장: 컨트롤+s
		// 실행: 컨트롤+f11
		// 자동완성: 컨트롤+스페이스바
		int age = 100; //대입연산자
		double eye = 2.0;
		char bus = 'b';
		boolean food = true;
		
		System.out.println("나이 " + age); //연결ㄹ연산자
		
		//일반적으로 1글자 이상쓸 때 String class!
		//기본형과 동일한 방법으로 대입/출력가능
		//스트링(실): 홍--길--동
		String name = "홍길동";
		String tel = "010112223";
		System.out.println("이름 " + name);
		
		
		String location = JOptionPane.showInputDialog("여기는 어디인가요");
		System.out.println("당신의 위치는 " + location);
		
		
		

	}

}
