package 문제풀이;

public class 비교논리연산자2 {

	public static void main(String[] args) {
		//회원가입시 가입한 id/pw
		int id = 1111;
		int pw = 2222;
		
		//로그인할 때 입력한 id/pw
		int id2 = 1111;
		int pw2 = 2000;
		//논리연산자: &&(and), ||(or), !(not)
		if (pw == pw2 && id == id2) {
			//&&인 경우, false일 가능성이 높은 것을 맨 앞 조건으로 쓰면 좋다.
			//||인 경우, true일 가능성이 높은 것을 맨 앞 조건으로 쓰면 좋다.
			System.out.println("로그인 성공!");
			System.out.println("축하합니다.!!");
		} else {
			System.out.println("로그인 실패@@");
		}
		
		

	}

}
