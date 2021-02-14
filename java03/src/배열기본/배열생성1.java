package 배열기본;

public class 배열생성1 {

	public static void main(String[] args) {
		//배열(array: 늘어놓다. 저장공간을 늘어놓듯이 여러개를 만들어둔다.)
		int[] s = new int[5];//s[0], s[1], ..., s[4]
		System.out.println(s); //배열이 저장되어 있는 "주소"가 들어있음.
		s[0] = 100;
		System.out.println("첫번째 들어있는 값은 " + s[0]);
		//배열은 length이라는 이름의 저장공간이 자동으로 하나 생김.
		//여기에는 배열의 개수가 들어있음.
		System.out.println(s.length + "개");
		
		//1000개의 int가 들어갈 수 있는 배열을 만들어보세요.
		//1000개의 저장공간을 가르키는 변수 s2를 만들어서 주소를 넣어보세요.
		int[] s2 = new int[1000];//복사
		
		//첫번째 공간에 100을 넣고, 두번째 공간에 200을 넣고, 마지막 공간에 500을 넣어서
		s2[0] = 100;
		s2[1] = 200;
		s2[999] = 500;
		
		//첫번째,두번째,마지막 공간의 값을 프린트해보세요.
		System.out.println("첫번째 공간의 값은 " + s2[0]);
		System.out.println("두번째 공간의 값은 " + s2[1]);
		System.out.println("마지막 공간의 값은 " + s2[999]);
		
		//배열의 개수도 프린트해보세요.
		System.out.println(s2.length + "개의 저장공간이 있음.");

	}

}
