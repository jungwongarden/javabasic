package 상속개념;

public class 직원 extends Object{
	//toString(), notify()
	//접근 제어자 4가진
	public String name; //아무곳이나 접근 가능
	String address; //같은 패키지 내에서만 접근 가능
	protected int salary; //다른 패키지라고 하더라도 상속받은곳이면 가능
	private int rrn; //클래스안에서만 접근 가능
	
	//1. 아무것도 상속받지 않는 클래스는 무조건 Object의 상속을 받는다.
	//2. 원래 toString()는 기본형인 경우에 값을, 참조형인 경우에 "주소"를 프린트해줌.
	//3. 참조형인 경우 주소말고 내가 원하는 멤버변수값을 프린트하고자 하는 경우, 재정의해주세요.!
	//4. 오버라이드: 원래 부모가 가지고 있던 모양과 똑같이 써줌.
//	public String toString() {
//		return name + " " + address + " " + salary + " " + rrn;
//	}
}
