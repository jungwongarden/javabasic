package 클래스사용하기;

import 클래스만들기.게시판글;

public class 게시판만들기 {

	public static void main(String[] args) {
		게시판글 bbs1 = new 게시판글();
		//사용하고자 하는 부품은 틀(class x)
		//틀을 통해 찍어낸 대상(object, 객체)
		//객체 지향형 프로그래밍
		//객체를 만드는 키워드: new!
		//객체 생성
		//new를 하는 순간 멤버변수들이 힙영역에 복사가 된다.
		//멤버변수들은 자동 초기화
		bbs1.no = 1;
		bbs1.title = "자바";
		bbs1.content = "펀 자바";
		bbs1.writer = "홍길동";
		bbs1.글쓰다();
		System.out.println(bbs1);
		
		bbs1.content = "자바 이제 시작";
		bbs1.글수정하다();
		System.out.println(bbs1);
		
				
	}

}
