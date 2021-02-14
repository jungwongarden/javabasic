package 인터페이스;

//전화기를 구현하려면 어떤 규칙을 가져야 할까 정의한 문서
//전화기를 가지고 할 수 있는 "기능을 규칙"으로 정의
//기능을 정의=> 메서드를 정의!
public interface Phone {
	//불완전한 메서드들로만 인터페이스를 정의해야한다.
	//불완전 ==> 추상적!(abstract): 추상메서드
	//인터페이스는 추상메서드로만 이루어진다.!!
	//abstract 생략 가능!
	//public 생략 가능!
	void internet(); //인터넷이 되어야한다.
	public abstract void call(); //전화가 되어야한다.
	public abstract void text(); //문자를 보낼 수 있어야한다.
	public abstract void kakao(); //카톡이 되어야 한다.
}
