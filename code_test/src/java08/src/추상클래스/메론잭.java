package 추상클래스;

import 인터페이스.아이폰잭규칙;

//추상메서드를 하나라도 가지고 있으면,
//무조건 그 클래스는 "추상클래스"
//불완전한 클래스는 객체생성 불가
public abstract class 메론잭 implements 아이폰잭규칙 {

	public abstract void 색깔이변하다();
	
	@Override
	public void 납작하게만들다() {
		System.out.println("초록색으로 납작하게 만들다.");

	}

	@Override
	public void 이센티로만들다() {
		System.out.println("중간길이로 이센티로 만들다.");
	}

}
