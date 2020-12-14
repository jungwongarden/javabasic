package 상속;

//기본import
import java.lang.*;

public class 수퍼맨 extends 맨{
	//멤버변수 3개, 멤버메서드 3개
	
	public void 날아다니다() {
		System.out.println("하늘을 날다.");
	}

	
	//수퍼맨을 가지고 사용할 때
	//생성된 변수는 참조형변수=>멤버변수 3개가 들어있는 주소
	//주소가 아닌 그 주소가 가르키는 멤버변수에 저장된 값을 프린트하고 
	//싶은 경우
	//=>toString()재정의, overriding(오버라이딩)
	
	@Override
	public String toString() {
		return "수퍼맨 [power=" + power + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
