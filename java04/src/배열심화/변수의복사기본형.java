package 배열심화;

public class 변수의복사기본형 {

	public static void main(String[] args) {
		//기본형 변수 복사
		//선언! 타입 변수명; => RAM에 공간이 할당
		int x = 100;
		int y = x; //기본형의 복사
		System.out.println("변경전 x: " + x);
		System.out.println("변경전 y: " + y);
		
		x = 99; //변경후
		System.out.println("변경후 x: " + x);
		System.out.println("변경후 y: " + y);
	}

}
