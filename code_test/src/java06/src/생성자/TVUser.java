package 생성자;

public class TVUser {

	public static void main(String[] args) {
		TV tv = new TV(); //객체생성(new)
		//TV: 클래스
		//tv: 클래스(틀)을 가지고 찍어낸 대상(Object, 객체)
		tv.ch = 7;
		tv.vol = 9;
		tv.onOff = true;
		tv.off();
		System.out.println(tv);
		
		System.out.println();
		
		TV tv2 = new TV(9, 12, true);
		System.out.println(tv2);
		
		
		
		
		
		
	}

}
