package 클래스복습;

public class 집을지어보자 {

	public static void main(String[] args) {
		//new는 객체생성의 의미!!!
		//new를 가지고 객체생성시, 멤버변수들이 복사
		벽돌틀 벽돌1 = new 벽돌틀();
		벽돌1.x = 50;
		벽돌1.y = 50;
		벽돌1.color = "회색";
		System.out.println(벽돌1);
		
		벽돌틀 벽돌2 = new 벽돌틀();
		벽돌2.x = 150;
		벽돌2.y = 150;
		벽돌2.color = "파랑색";
		System.out.println(벽돌2);
		
		벽돌1.쌓다();
		벽돌2.쌓다();

	}

}
