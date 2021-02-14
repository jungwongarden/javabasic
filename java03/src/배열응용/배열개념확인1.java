package 배열응용;

public class 배열개념확인1 {

	public static void main(String[] args) {
		// 1. 배열을 만들 때, 이미 값 들을 알고 있는 경우
		// 2. 배열을 만들 때, 값 들을 모르다가 나중에 넣는 경우
		int[] s = new int[3]; //{ 0, 0, 0}
		// 배열은 자동초기화된 상태에서 사용 가능!
		s[0] = 100;
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
//		System.out.println(s[3]);
		System.out.println("내가 실행될까요.");
		
		int s2; //쓰레기값이 들어있음.
		s2 = 100; //프로그래머가 사용하고 싶은 처음값을 넣어주어야함.
		          //초기값을 넣어주어야함.(변수의 초기화)
		System.out.println(s2);
		
		//참조형변수의 배열은 null로 초기화
		String[] s3 = new String[2]; //{null, null}
		System.out.println(s3[0]);

	}

}
