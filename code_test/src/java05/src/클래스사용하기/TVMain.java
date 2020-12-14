package 클래스사용하기;

import 클래스만들기.TV;

public class TVMain {

	public static void main(String[] args) {
		TV myTv = new TV();
		//생성자로 객체 생성후, 초기값을 자동으로 넣어줄 수 있다.
		myTv.ch= 7;
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println(myTv);
		
		TV yourTv = new TV();
		yourTv.ch= 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println(yourTv);
		
		
		
		
		
	}	

}
