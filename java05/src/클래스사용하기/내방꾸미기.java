package 클래스사용하기;

import 클래스만들기.TV;
import 클래스만들기.강아지;
import 클래스만들기.휴대폰;

public class 내방꾸미기 {

	public static void main(String[] args) {
		
		TV myTv = new TV();
		myTv.ch = 100;
		myTv.vol = 50;
		myTv.onOff = true;
		System.out.println(myTv);
		
		TV yourTv = new TV();
		yourTv.ch = 200;
		yourTv.vol = 60;
		yourTv.onOff = false;
		System.out.println(yourTv);
		
		//main메서드 안에서 만들어지는 변수는 모두 지역변수(local변수)
		//변수타입 변수명;
		//로컬변수인 경우는 선언시 쓰레기값이 들어있는 상태!
		//로컬변수는 바로 프린트x, 연산x
		//로컬변수는 초기화를 반드시 해주어야 한다.
		//int count = 0;
		
		
		
		휴대폰 p1 = new 휴대폰(); 
		p1.color = "금색";
		p1.company = "kg";
		p1.인터넷하다();
		System.out.println("내 휴대폰 색: " + p1.color);
		System.out.println("내 휴대폰 통신사: " + p1.company);
		System.out.println(p1);
		
		// 강아지 1마리
		강아지 dog1 = new 강아지();
		dog1.짖다();
		dog1.잠자다();
//		dog1.color = "황토색";
//		dog1.name = "왈왈";
		System.out.println(dog1);
//		System.out.println("강아지 색: " + dog1.color);
//		System.out.println("강아지 이름: " + dog1.name);
		
		
	}

}
