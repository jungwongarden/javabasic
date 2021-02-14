package 인터페이스;

public class 폰사용 {

	public static void main(String[] args) {
		//불완전한 추상클래스나 인터페이스로는 new로 객체생성불가능!
		//Phone phone = new BananaPhone();
		Phone phone = new ApplePhone();
		//큰           <-----  작      : 자동형변환
		//유지보수가 용이하다!!!
		phone.call();
		phone.internet();
		phone.kakao();
		phone.text();
	}

}
