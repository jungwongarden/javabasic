package 클래스복습;

//틀의 역할
public class 계좌 {
	//성질(특성)=> 멤버변수, new를 가지고 객체생성시 복사가 되는 변수
	String name;
	String field;
	int money;
	
	//동작
	public void 입금하다() {
		System.out.println("계좌에 돈을 넣다.");
	}
	public void 출금하다() {
		System.out.println("계좌에서 돈을 꺼내다.");
	}
	
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}
	
	
}









