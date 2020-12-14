package 객체지향형;

//기준이 되는 문서: 인터페이스
public class 휴대폰 {
	//멤버변수, 전역변수
	String color; //선언!
	String company;
	
	//멤버메서드
	public void 전화하다() {
		System.out.println(color + "색 전화기로 전화를 걸다.");
	}
	public void 문자하다() {
		System.out.println("문자를 보내다.");
	}
	public void 인터넷하다() {
		System.out.println("인터넷으로 유튜브를 보다.");
	}
}

