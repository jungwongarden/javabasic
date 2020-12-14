package 인터페이스;

public interface 아이폰잭규칙 {
	//추상메서드만 넣어야 한다.!
	//상수!final이 붙으면 변경불가
	final String COMPANY = "APPLE";
	//멤버변수, 멤버메서드??
	//멤버메서드(기능이 중요!)
	//기능에대한 규칙만 정함!
	public abstract void 납작하게만들다();
	void 이센티로만들다();
	//분완전한 메서드<->일반메서드와 다르게 구현하는 부분이 없음.
	//변수사용 불가
	//new 아이폰잭규칙();//객체생성 불가
	//불완전 => 추상(abstract) 
	//추상메서드
}
