package 클래스만들기;

public class 휴대폰 {
	//성질: 색, 통신사=> 멤버변수
	//변수 선언!
	public String color;
	public String company;
	
	//동작: 카톡하다, 인터넷하다=> 멤버메서드(멤버함수)
	//동작을 정의한다.(메서드를 정의한다.)
	public void 카톡하다() {
		System.out.println("단체톡을 열다.");
		System.out.println("공지사항을 띄우다.");
	}
	public void 인터넷하다() {
		System.out.println("카페에 로그인하다.");
		System.out.println("카페에 글을 올리다.");
	}
	
	@Override
	public String toString() {
		return "휴대폰 [color=" + color + ", company=" + company + "]";
	}
	
	
}
