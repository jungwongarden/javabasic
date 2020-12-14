package 배열기본;

public class 간단한배열 {

	public static void main(String[] args) {
		int[] s = new int[3]; //{0,0,0}
		//배열은 자동 초기화: int<=0
		//s: 주소
		s[0] = 100;
		s[2] = 200;
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[1]);
		System.out.println(s.length + "개");
		
		int x = 0; //변수가 만들어진다.선언!
		//선언을 할 때 변수가 만들어진다.
		//선언을 할 때 변수의 데이터 유형이 결정
		//x에는 쓰레기값이 들어간다!
		//변수에는 쓰레기값이 들어가있기 때문에
		//변수를 만들 때는 초기값을 넣어주어야 쓸 수 있다.
		System.out.println(x);

	}

}
