package 클래스만들기;

//강아지 class는 강아지 틀역할!!
//강아지가 필요하면 class를 이용해서 찍어내서 쓰면 됨.
//public:접근제어자 중 하나, 아무패키지에서 접근 가능
//x(안써줌): 접근제어자 중 하나, 같은패키지에서만 접근 가능
public class 강아지 {
	//강아지가 가지는 특성으로 "틀"을 만들어야 한다.
	//성질: 색, 이름 => 변수
	public String color;
	public String name;
	
	//동작: 짖다, 잠자다. => 함수(기능처리)-> 메서드
	public void 짖다() {
		System.out.println("강아지가 왈왈 짖다.");
	}
	public void 잠자다() {
		System.out.println("강아지가 집에 들어가서 잠자다.");
	}
	
	@Override
	public String toString() {
		return "강아지 [color=" + color + ", name=" + name + "]";
	}
	
	
}
