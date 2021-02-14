package 제어문;

public class 로그인 {

	public static void main(String[] args) {
		int id = 1000; //회원가입했을 때의 지정된 id
		int id2 = 2000; //로그인할 때의 입력한 id
		
		//조건문: 조건안에는 비교연산자를 써서 true/false의 
		//결과값이 나오게 해야함.
		if (id == id2) { //맞으면, true
			System.out.println("로그인 성공");
		} else { //맞지 않으면, false
			System.out.println("로그인  실패");
		}
		

	}

}
