package 연산자;

public class 로그인처리2 {

	public static void main(String[] args) {
		//회원가입할 때 썼던 정보
		int id = 1111;
		int pw = 2222;
		
		//로그인할 때 입력한 정보
		int id2 = 1000;
		int pw2 = 2222;
		
		//논리 연산자: 조건이 많을 때, 논리적으로 판단한 기준
		//and조건: 모든 조건이 맞아야하는 경우 &&
		//or조건: 조건이 하나만 맞아도 되는 경우 ||
		if (id == id2 &&pw == pw2) { //true이면
			System.out.println("로그인 성공!");
		} else { //false이면
			System.out.println("로그인 실패!");
		}
		
		
		
		
		
		
		
		
		
	}

}
