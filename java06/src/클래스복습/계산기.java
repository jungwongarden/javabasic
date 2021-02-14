package 클래스복습;

public class 계산기 {
	//계산기를 가지고 할 수 있는 동작은 메서드로 만든다.
	//멤버메서드
	//public: 아무데서나 접근 가능
	//void: 리턴이 없음.
	//더하기: 메서드 이름(동작이름)
	//(int x, int y): 동작을 처리하기 위한 입력값
	public void 더하기(int x, int y) {
		//더하기 메서드 안에서 만들어진 x,y는
		//더하기 메서드 지역안에서만 사용 가능
		//지역변수
		//x, y를 매개변수, 파라메터
		System.out.println("더하기 기능 처리 내용");
		System.out.println(x + y);
	}
	public int 빼기(int x, int y) {
		System.out.println("빼기 기능 처리 내용");
		int result = x - y;
		System.out.println("뺀 결과값은 " + result + "원");
		return result;
	}
	public void 곱하기(int x, int y, int z) {
		System.out.println("곱하기 기능 처리 내용");
		System.out.println(x * y * z);
	}
	public int 나누기(int x, int y) {
		System.out.println("나누기 기능 처리 내용");
		return x / y;
	}
}




















