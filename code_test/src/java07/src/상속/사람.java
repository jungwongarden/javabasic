package 상속;


//모든 클래스는 Object의 상속을 받는다.
public class 사람 extends Object{
	//부품을 만들때는 2가지 특징을 고려
	//성질: 이름, 성별
	//동작(기능): 잠자다, 먹다(*)=>메서드(함수)
	String name;
	char gender;
	
	public void 잠자다() {
		System.out.println("잠을 자다.");
	}
	
	public void 먹다() {
		System.out.println("음식을 먹다.");
	}
	
	
}
